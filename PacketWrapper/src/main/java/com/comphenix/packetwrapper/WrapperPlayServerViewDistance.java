package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerViewDistance extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.VIEW_DISTANCE;

    public WrapperPlayServerViewDistance() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerViewDistance(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getRadius() {
        return this.handle.getIntegers().read(0);
    }

    public void setRadius(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
