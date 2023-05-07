package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;
import com.comphenix.protocol.wrappers.WrappedPacketDataSerializer;

public class WrapperPlayClientCustomPayload extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CUSTOM_PAYLOAD;

    public WrapperPlayClientCustomPayload() {
        super(TYPE);
    }

    public WrapperPlayClientCustomPayload(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'identifier'
     *
     * @return 'identifier'
     */
    public MinecraftKey getIdentifier() {
        return this.handle.getMinecraftKeys().read(0);
    }

    /**
     * Sets the value of field 'identifier'
     *
     * @param value New value for field 'identifier'
     */
    public void setIdentifier(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    /**
     * Retrieves the value of field 'data'
     *
     * @return 'data'
     */
    public WrappedPacketDataSerializer getData() {
        return this.handle.getPacketDataSerializers().read(0);
    }

    /**
     * Sets the value of field 'data'
     *
     * @param value New value for field 'data'
     */
    public void setData(WrappedPacketDataSerializer value) {
        this.handle.getPacketDataSerializers().write(0, value);
    }

}
