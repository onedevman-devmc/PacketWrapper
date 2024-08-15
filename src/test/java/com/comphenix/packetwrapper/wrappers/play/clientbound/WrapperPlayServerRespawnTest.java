package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.data.ResourceKey;
import com.comphenix.packetwrapper.wrappers.data.Vector3I;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.bukkit.Bukkit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author Lukas Alt
 * @since 15.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerRespawnTest {
    @Test
    public void test() {
        WrapperPlayServerRespawn dummy = new WrapperPlayServerRespawn();

        dummy.setDimensionType(new ResourceKey(new MinecraftKey("minecraft", "dimension_type"), new MinecraftKey("minecraft", "overworld")));
        dummy.setDimension(Bukkit.getWorlds().get(0));
        dummy.setSeed(1337);
        dummy.setPlayerGameType(EnumWrappers.NativeGameMode.ADVENTURE);
        dummy.setPreviousPlayerGameType(EnumWrappers.NativeGameMode.CREATIVE);
        dummy.setDataToKeep((byte) 1);
        dummy.setIsDebug(false);
        dummy.setIsFlat(true);
        dummy.setLastDeathLocation(Vector3I.newInstance(1, 3, 6));

    }
}