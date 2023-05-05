package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerAttachEntity extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ATTACH_ENTITY;

    public WrapperPlayServerAttachEntity() {
        super(TYPE);
    }

    public WrapperPlayServerAttachEntity(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSourceId() {
        return this.handle.getIntegers().read(0);
    }

    public void setSourceId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getDestId() {
        return this.handle.getIntegers().read(1);
    }

    public void setDestId(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
