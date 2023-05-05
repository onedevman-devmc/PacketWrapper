package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientSteerVehicle extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.STEER_VEHICLE;

    public WrapperPlayClientSteerVehicle() {
        super(TYPE);
    }

    public WrapperPlayClientSteerVehicle(PacketContainer packet) {
        super(packet, TYPE);
    }

    public float getXxa() {
        return this.handle.getFloat().read(0);
    }

    public void setXxa(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getZza() {
        return this.handle.getFloat().read(1);
    }

    public void setZza(float value) {
        this.handle.getFloat().write(1, value);
    }

    public boolean getIsJumping() {
        return this.handle.getBooleans().read(0);
    }

    public void setIsJumping(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getIsShiftKeyDown() {
        return this.handle.getBooleans().read(1);
    }

    public void setIsShiftKeyDown(boolean value) {
        this.handle.getBooleans().write(1, value);
    }


}
