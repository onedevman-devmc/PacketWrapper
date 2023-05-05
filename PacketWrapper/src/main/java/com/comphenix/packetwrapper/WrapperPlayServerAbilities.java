package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerAbilities extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ABILITIES;

    public WrapperPlayServerAbilities() {
        super(TYPE);
    }

    public WrapperPlayServerAbilities(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getInvulnerable() {
        return this.handle.getBooleans().read(0);
    }

    public void setInvulnerable(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getIsFlying() {
        return this.handle.getBooleans().read(1);
    }

    public void setIsFlying(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public boolean getCanFly() {
        return this.handle.getBooleans().read(2);
    }

    public void setCanFly(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    public boolean getInstabuild() {
        return this.handle.getBooleans().read(3);
    }

    public void setInstabuild(boolean value) {
        this.handle.getBooleans().write(3, value);
    }

    public float getFlyingSpeed() {
        return this.handle.getFloat().read(0);
    }

    public void setFlyingSpeed(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getWalkingSpeed() {
        return this.handle.getFloat().read(1);
    }

    public void setWalkingSpeed(float value) {
        this.handle.getFloat().write(1, value);
    }


}
