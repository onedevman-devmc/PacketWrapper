package com.comphenix.packetwrapper;

import com.comphenix.packetwrapper.util.TestExclusion;
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

    /**
     * Retrieves the value of field 'transactionId'
     *
     * @return 'transactionId'
     */
    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'transactionId'
     *
     * @param value New value for field 'transactionId'
     */
    public void setTransactionId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'data'
     *
     * @return 'data'
     */
    @TestExclusion
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
