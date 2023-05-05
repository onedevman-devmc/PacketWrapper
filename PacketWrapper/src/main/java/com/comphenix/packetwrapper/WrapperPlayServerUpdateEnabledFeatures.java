package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.List;

public class WrapperPlayServerUpdateEnabledFeatures extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_ENABLED_FEATURES;

    public WrapperPlayServerUpdateEnabledFeatures() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateEnabledFeatures(PacketContainer packet) {
        super(packet, TYPE);
    }

    public List<MinecraftKey> getFeatures() {
        return this.handle.getLists(MinecraftKey.getConverter()).read(0);
    }

    public void setFeatures(List<MinecraftKey> value) {
        this.handle.getLists(MinecraftKey.getConverter()).write(0, value);

    }


}
