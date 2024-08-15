package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.util.Utils;
import com.comphenix.protocol.wrappers.ChunkCoordIntPair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 18.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerChunksBiomesTest {
    @Test
    public void test() {
        WrapperPlayServerChunksBiomes dummy = new WrapperPlayServerChunksBiomes();
        List<WrapperPlayServerChunksBiomes.WrappedChunkBiomeData> value = List.of(new WrapperPlayServerChunksBiomes.WrappedChunkBiomeData(new ChunkCoordIntPair(1337, -42), new byte[128]));
        dummy.setChunkBiomeData(value);
        assertEquals(value, dummy.getChunkBiomeData());
    }

    @Test
    public void testChunkBiomeDataConverter() {
        final byte[] buffer = new byte[128];
        new Random().nextBytes(buffer);
        WrapperPlayServerChunksBiomes.WrappedChunkBiomeData data = new WrapperPlayServerChunksBiomes.WrappedChunkBiomeData(new ChunkCoordIntPair(1337, -42), buffer);
        WrapperPlayServerChunksBiomes.WrappedChunkBiomeData result = Utils.unwrapAndWarp(data, WrapperPlayServerChunksBiomes.WrappedChunkBiomeData.CONVERTER);
        assertEquals(data, result);
    }
}