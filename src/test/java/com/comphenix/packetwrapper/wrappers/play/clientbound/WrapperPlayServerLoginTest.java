package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.data.ResourceKey;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.bukkit.Bukkit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerLoginTest {

    @Test
    public void test() {
        WrapperPlayServerLogin dummy = new WrapperPlayServerLogin();
        dummy.setChunkRadius(16);
        dummy.setHardcore(true);
        dummy.setIsDebug(true);
        dummy.setLevels(new HashSet<>(Bukkit.getWorlds()));
        ResourceKey dimensionType = new ResourceKey(new MinecraftKey("minecraft", "dimension_type"), new MinecraftKey("minecraft", "overworld"));
        dummy.setDimensionType(dimensionType);
        dummy.setDimension(Bukkit.getWorlds().get(0));

        assertEquals(dimensionType.getLocation().getFullKey(), dummy.getDimensionType().getLocation().getFullKey());
        assertEquals(dimensionType.getLocation().getKey(), dummy.getDimensionType().getLocation().getKey());
        assertEquals(dimensionType.getLocation().getPrefix(), dummy.getDimensionType().getLocation().getPrefix());
        assertEquals(dimensionType.getRegistry().getFullKey(), dummy.getDimensionType().getRegistry().getFullKey());
        assertEquals(dimensionType.getRegistry().getKey(), dummy.getDimensionType().getRegistry().getKey());
        assertEquals(dimensionType.getRegistry().getPrefix(), dummy.getDimensionType().getRegistry().getPrefix());
        // assertEquals(Bukkit.getWorlds().get(0), dummy.getDimension());
    }

}