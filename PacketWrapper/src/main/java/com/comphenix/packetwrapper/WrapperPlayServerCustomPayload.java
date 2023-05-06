package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.wrappers.WrappedPacketDataSerializer;

public class WrapperPlayServerCustomPayload extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CUSTOM_PAYLOAD;

    public WrapperPlayServerCustomPayload() {
        super(TYPE);
    }

    public WrapperPlayServerCustomPayload(PacketContainer packet) {
        super(packet, TYPE);
    }

    public MinecraftKey getIdentifier() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setIdentifier(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    public WrappedPacketDataSerializer getData() {
        return this.handle.getPacketDataSerializers().read(0);
    }

    public void setData(WrappedPacketDataSerializer value) {
        this.handle.getPacketDataSerializers().write(0, value);
    }


}
