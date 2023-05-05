package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerAnimation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ANIMATION;

    public WrapperPlayServerAnimation() {
        super(TYPE);
    }

    public WrapperPlayServerAnimation(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getAction() {
        return this.handle.getIntegers().read(1);
    }

    public void setAction(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
