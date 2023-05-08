package com.comphenix.packetwrapper;

import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.reflect.StructureModifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Constructor;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerBossTest {
    @Test
    public void testPlayServerBoss() throws Exception {
        WrapperPlayServerBoss dummy = new WrapperPlayServerBoss();
        dummy.setId(UUID.randomUUID());
        Class<?> clazz = dummy.getHandle().getHandle().getClass().getDeclaredClasses()[3];
        Constructor<?> constructor = clazz.getDeclaredConstructor(float.class);
        constructor.setAccessible(true);
        assertNotNull(clazz);
        assertNotNull(constructor);
        Object instance = constructor.newInstance(1.0F);
        dummy.setOperation(new InternalStructure(instance, new StructureModifier<>(clazz).withTarget(instance)));
        assertNotNull(dummy.getOperation());
    }

}