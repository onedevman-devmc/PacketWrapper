package com.comphenix.packetwrapper;

import com.comphenix.protocol.utility.MinecraftVersion;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class PacketWrapper extends JavaPlugin {
    @Override
    public void onEnable() {
        if(!Objects.equals(MinecraftVersion.getCurrentVersion(), MinecraftVersion.FEATURE_PREVIEW_2)) {
            this.getLogger().severe("Incompatible version of Minecraft. This version of PacketWrapper is only compatible with Minecraft 1.19.4 but you are using " + MinecraftVersion.getCurrentVersion());
        }
    }
}
