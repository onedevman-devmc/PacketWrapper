package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.util.UUID;

public class WrapperPlayServerNamedEntitySpawn extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.NAMED_ENTITY_SPAWN;

    public WrapperPlayServerNamedEntitySpawn() {
        super(TYPE);
    }

    public WrapperPlayServerNamedEntitySpawn(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public UUID getPlayerId() {
        return this.handle.getUUIDs().read(0);
    }

    public void setPlayerId(UUID value) {
        this.handle.getUUIDs().write(0, value);
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

    public byte getYRot() {
        return this.handle.getBytes().read(0);
    }

    public void setYRot(byte value) {
        this.handle.getBytes().write(0, value);
    }

    public byte getXRot() {
        return this.handle.getBytes().read(1);
    }

    public void setXRot(byte value) {
        this.handle.getBytes().write(1, value);
    }


}
