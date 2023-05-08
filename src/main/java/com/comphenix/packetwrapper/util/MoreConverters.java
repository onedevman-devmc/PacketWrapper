package com.comphenix.packetwrapper.util;

import com.comphenix.protocol.reflect.EquivalentConverter;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
public class MoreConverters {

    public static <V> EquivalentConverter<Int2ObjectMap<V>> getInt2ObjectMapConverter(EquivalentConverter<V> valConverter) {
        return new EquivalentConverter<>() {
            @Override
            public Int2ObjectMap<V> getSpecific(Object generic) {
                Map<Object, Object> genericMap = (Map<Object, Object>) generic;
                Int2ObjectMap<V> newMap;

                try {
                    newMap = (Int2ObjectMap<V>) genericMap.getClass().newInstance();
                } catch (ReflectiveOperationException ex) {
                    newMap = new Int2ObjectOpenHashMap<>();
                }

                for (Map.Entry<Object, Object> entry : genericMap.entrySet()) {
                    newMap.put(((Integer) entry.getKey()).intValue(), valConverter.getSpecific(entry.getValue()));
                }

                return newMap;
            }

            @Override
            public Object getGeneric(Int2ObjectMap<V> specific) {
                Map<Object, Object> newMap;

                try {
                    newMap = specific.getClass().newInstance();
                } catch (ReflectiveOperationException ex) {
                    newMap = new HashMap<>();
                }

                for (Int2ObjectMap.Entry<V> entry : specific.int2ObjectEntrySet()) {
                    newMap.put(entry.getIntKey(), valConverter.getGeneric(entry.getValue()));
                }

                return newMap;
            }

            @Override
            public Class<Int2ObjectMap<V>> getSpecificType() {
                return null;
            }
        };
    }
}
