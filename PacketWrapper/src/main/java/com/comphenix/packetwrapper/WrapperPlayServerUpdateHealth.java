package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateHealth extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_HEALTH;

    public WrapperPlayServerUpdateHealth() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerUpdateHealth(PacketContainer packet) {
        super(packet, TYPE);
    }

    public float getHealth() {
        return this.handle.getFloat().read(0);
    }

    public void setHealth(float value) {
        this.handle.getFloat().write(0, value);
    }

    public int getFood() {
        return this.handle.getIntegers().read(0);
    }

    public void setFood(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public float getSaturation() {
        return this.handle.getFloat().read(1);
    }

    public void setSaturation(float value) {
        this.handle.getFloat().write(1, value);
    }


}
