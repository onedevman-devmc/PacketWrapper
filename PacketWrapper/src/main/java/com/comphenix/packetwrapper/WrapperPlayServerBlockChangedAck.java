package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBlockChangedAck extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_CHANGED_ACK;

    public WrapperPlayServerBlockChangedAck() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerBlockChangedAck(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSequence() {
        return this.handle.getIntegers().read(0);
    }

    public void setSequence(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
