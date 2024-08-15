package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.util.Utils;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerMapTest {
    @Test
    public void test() {
        WrapperPlayServerMap dummy = new WrapperPlayServerMap();
        WrapperPlayServerMap.WrappedMapPatch patch = new WrapperPlayServerMap.WrappedMapPatch(1, 2, 3, 4, new byte[256]);
        dummy.setMapId(1337);
        dummy.setColorPatch(patch);
        dummy.setScale((byte) 4);
        dummy.setDecorations(List.of(new WrapperPlayServerMap.WrappedMapDecoration(WrapperPlayServerMap.DecorationType.BANNER_BLACK, (byte) 1, (byte) 2, (byte) 3, WrappedChatComponent.fromText("Test"))));
        assertEquals(1337, dummy.getMapId());
        assertEquals(patch, dummy.getColorPatch());
        assertEquals((byte) 4, dummy.getScale());

        dummy.setColorPatch(null);
        assertNull(dummy.getColorPatch());
        dummy.setDecorations(null);
        assertNull(dummy.getDecorations());
    }

    @Test
    public void testDecoration() {
        WrapperPlayServerMap.WrappedMapDecoration decoration = new WrapperPlayServerMap.WrappedMapDecoration();
        decoration.setType(WrapperPlayServerMap.DecorationType.BANNER_BLACK);
        decoration.setX((byte) 1);
        decoration.setY((byte) 2);
        decoration.setRot((byte) 3);
        decoration.setName(WrappedChatComponent.fromText("Test"));
        decoration = Utils.unwrapAndWarp(decoration, WrapperPlayServerMap.WrappedMapDecoration.CONVERTER);

        assertEquals(WrapperPlayServerMap.DecorationType.BANNER_BLACK, decoration.getType());
        assertEquals((byte) 1, decoration.getX());
        assertEquals((byte) 2, decoration.getY());
        assertEquals((byte) 3, decoration.getRot());
        assertEquals(WrappedChatComponent.fromText("Test"), decoration.getName());

        decoration.setName(null);
        decoration = Utils.unwrapAndWarp(decoration, WrapperPlayServerMap.WrappedMapDecoration.CONVERTER);
        assertNull(decoration.getName());
    }
}