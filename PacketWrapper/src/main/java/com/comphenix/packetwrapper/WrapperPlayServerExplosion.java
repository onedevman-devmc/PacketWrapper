package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

import java.util.List;

public class WrapperPlayServerExplosion extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.EXPLOSION;

    public WrapperPlayServerExplosion() {
        super(TYPE);
    }

    public WrapperPlayServerExplosion(PacketContainer packet) {
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

    public float getPower() {
        return this.handle.getFloat().read(0);
    }

    public void setPower(float value) {
        this.handle.getFloat().write(0, value);
    }

    public List<BlockPosition> getToBlow() {
        return this.handle.getLists(BlockPosition.getConverter()).read(0);
    }

    public void setToBlow(List<BlockPosition> value) {
        this.handle.getLists(BlockPosition.getConverter()).write(0, value);
    }

    public float getKnockbackX() {
        return this.handle.getFloat().read(1);
    }

    public void setKnockbackX(float value) {
        this.handle.getFloat().write(1, value);
    }

    public float getKnockbackY() {
        return this.handle.getFloat().read(2);
    }

    public void setKnockbackY(float value) {
        this.handle.getFloat().write(2, value);
    }

    public float getKnockbackZ() {
        return this.handle.getFloat().read(3);
    }

    public void setKnockbackZ(float value) {
        this.handle.getFloat().write(3, value);
    }


}
