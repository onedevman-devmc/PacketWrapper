package com.comphenix.packetwrapper.util;

import com.comphenix.protocol.reflect.EquivalentConverter;
import com.google.common.reflect.ClassPath;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Lukas Alt
 * @since 07.05.2023
 */
public class Utils {

    // https://www.baeldung.com/java-find-all-classes-in-package
    public static Set<Class<?>> getClassesInPackage(String packageName, Class<?> parent) throws IOException {
        return ClassPath.from(ClassLoader.getSystemClassLoader())
                .getAllClasses()
                .stream()
                .filter(clazz -> clazz.getPackageName().toLowerCase().startsWith(packageName.toLowerCase()))
                .map(clazz -> clazz.load())
                .filter(clazz -> clazz.getSuperclass() != null && clazz.getSuperclass() == parent)
                .collect(Collectors.toSet());
    }

    public static <K> K unwrapAndWarp(K v, EquivalentConverter<K> converter) {
        return converter.getSpecific(converter.getGeneric(v));
    }

    public static String tryToString(Object object) {
        try {
            return object.toString();
        } catch (Throwable t) {
            return "?";
        }
    }
}
