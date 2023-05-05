package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityHeadRotation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_HEAD_ROTATION;

    public WrapperPlayServerEntityHeadRotation() {
        super(TYPE);
    }

    public WrapperPlayServerEntityHeadRotation(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public byte getYHeadRot() {
        return this.handle.getBytes().read(0);
    }

    public void setYHeadRot(byte value) {
        this.handle.getBytes().write(0, value);
    }


}
