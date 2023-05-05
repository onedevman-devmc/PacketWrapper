package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerVehicleMove extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.VEHICLE_MOVE;

    public WrapperPlayServerVehicleMove() {
        super(TYPE);
    }

    public WrapperPlayServerVehicleMove(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getX() {
        return this.handle.getDoubles().read(0);
    }

    public void setX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getY() {
        return this.handle.getDoubles().read(1);
    }

    public void setY(double value) {
        this.handle.getDoubles().write(1, value);
    }

    public double getZ() {
        return this.handle.getDoubles().read(2);
    }

    public void setZ(double value) {
        this.handle.getDoubles().write(2, value);
    }

    public float getYRot() {
        return this.handle.getFloat().read(0);
    }

    public void setYRot(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getXRot() {
        return this.handle.getFloat().read(1);
    }

    public void setXRot(float value) {
        this.handle.getFloat().write(1, value);
    }


}
