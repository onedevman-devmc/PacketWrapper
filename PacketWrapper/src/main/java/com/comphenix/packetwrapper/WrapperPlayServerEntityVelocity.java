package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityVelocity extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_VELOCITY;

    public WrapperPlayServerEntityVelocity() {
        super(TYPE);
    }

    public WrapperPlayServerEntityVelocity(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
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


}
