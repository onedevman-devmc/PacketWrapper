package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBlockChangedAck extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_CHANGED_ACK;

    public WrapperPlayServerBlockChangedAck() {
        super(TYPE);
    }

    public WrapperPlayServerBlockChangedAck(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'sequence'
     *
     * @return 'sequence'
     */
    public int getSequence() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'sequence'
     *
     * @param value New value for field 'sequence'
     */
    public void setSequence(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
