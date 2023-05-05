package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerViewCentre extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.VIEW_CENTRE;

    public WrapperPlayServerViewCentre() {
        super(TYPE);
    }

    public WrapperPlayServerViewCentre(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getX() {
        return this.handle.getIntegers().read(0);
    }

    public void setX(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getZ() {
        return this.handle.getIntegers().read(1);
    }

    public void setZ(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
