package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
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

    /**
     * Retrieves the value of field 'entityId'
     *
     * @return 'entityId'
     */
    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entityId'
     *
     * @param value New value for field 'entityId'
     */
    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'yHeadRot'
     *
     * @return 'yHeadRot'
     */
    public byte getYHeadRot() {
        return this.handle.getBytes().read(0);
    }

    /**
     * Sets the value of field 'yHeadRot'
     *
     * @param value New value for field 'yHeadRot'
     */
    public void setYHeadRot(byte value) {
        this.handle.getBytes().write(0, value);
    }

}
