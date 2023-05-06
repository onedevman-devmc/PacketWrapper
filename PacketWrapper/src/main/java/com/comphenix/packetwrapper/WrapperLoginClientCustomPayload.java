package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedPacketDataSerializer;

public class WrapperLoginClientCustomPayload extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Client.CUSTOM_PAYLOAD;

    public WrapperLoginClientCustomPayload() {
        super(TYPE);
    }

    public WrapperLoginClientCustomPayload(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }

    public void setTransactionId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public WrappedPacketDataSerializer getData() {
        return this.handle.getPacketDataSerializers().read(0);
    }

    public void setData(WrappedPacketDataSerializer value) {
        this.handle.getPacketDataSerializers().write(0, value);
    }


}
