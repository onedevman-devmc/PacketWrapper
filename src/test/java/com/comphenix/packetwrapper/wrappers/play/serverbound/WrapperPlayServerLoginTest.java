package com.comphenix.packetwrapper.wrappers.play.serverbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.data.Vector3I;
import com.comphenix.packetwrapper.wrappers.play.clientbound.WrapperPlayServerLogin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 12.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerLoginTest {
    @Test
    public void test() {
        WrapperPlayServerLogin dummy = new WrapperPlayServerLogin();
        dummy.setLastDeathLocation(null);
        assertNotNull(dummy.getLastDeathLocation());
        assertTrue(dummy.getLastDeathLocation().isEmpty());
        dummy.setLastDeathLocation(Vector3I.newInstance(1, 2, 3));
        assertNotNull(dummy.getLastDeathLocation());
        assertTrue(dummy.getLastDeathLocation().isPresent());
        assertEquals(1, dummy.getLastDeathLocation().get().getX());
        assertEquals(2, dummy.getLastDeathLocation().get().getY());
        assertEquals(3, dummy.getLastDeathLocation().get().getZ());

    }
}