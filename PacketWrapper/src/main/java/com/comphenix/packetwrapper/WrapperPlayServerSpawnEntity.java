package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.entity.EntityType;

import java.util.UUID;

public class WrapperPlayServerSpawnEntity extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_ENTITY;

    public WrapperPlayServerSpawnEntity() {
        super(TYPE);
    }

    public WrapperPlayServerSpawnEntity(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public UUID getUuid() {
        return this.handle.getUUIDs().read(0);
    }

    public void setUuid(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

    public EntityType getType() {
        return this.handle.getEntityTypeModifier().read(0);
    }

    public void setType(EntityType value) {
        this.handle.getEntityTypeModifier().write(0, value);
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

    public int getXa() {
        return this.handle.getIntegers().read(1);
    }

    public void setXa(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getYa() {
        return this.handle.getIntegers().read(2);
    }

    public void setYa(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public int getZa() {
        return this.handle.getIntegers().read(3);
    }

    public void setZa(int value) {
        this.handle.getIntegers().write(3, value);
    }

    public byte getXRot() {
        return this.handle.getBytes().read(0);
    }

    public void setXRot(byte value) {
        this.handle.getBytes().write(0, value);
    }

    public byte getYRot() {
        return this.handle.getBytes().read(1);
    }

    public void setYRot(byte value) {
        this.handle.getBytes().write(1, value);
    }

    public byte getYHeadRot() {
        return this.handle.getBytes().read(2);
    }

    public void setYHeadRot(byte value) {
        this.handle.getBytes().write(2, value);
    }

    public int getData() {
        return this.handle.getIntegers().read(4);
    }

    public void setData(int value) {
        this.handle.getIntegers().write(4, value);
    }


}
