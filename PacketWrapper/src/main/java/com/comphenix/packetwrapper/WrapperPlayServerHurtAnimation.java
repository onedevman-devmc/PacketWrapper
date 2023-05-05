package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerHurtAnimation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.HURT_ANIMATION;

    public WrapperPlayServerHurtAnimation() {
        super(TYPE);
    }

    public WrapperPlayServerHurtAnimation(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public float getYaw() {
        return this.handle.getFloat().read(0);
    }

    public void setYaw(float value) {
        this.handle.getFloat().write(0, value);
    }


}
