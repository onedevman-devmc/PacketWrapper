package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerAutoRecipe extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.AUTO_RECIPE;

    public WrapperPlayServerAutoRecipe() {
        super(TYPE);
    }

    public WrapperPlayServerAutoRecipe(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public MinecraftKey getRecipe() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setRecipe(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }


}
