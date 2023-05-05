package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerInitializeBorder extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.INITIALIZE_BORDER;

    public WrapperPlayServerInitializeBorder() {
        super(TYPE);
    }

    public WrapperPlayServerInitializeBorder(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getNewCenterX() {
        return this.handle.getDoubles().read(0);
    }

    public void setNewCenterX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getNewCenterZ() {
        return this.handle.getDoubles().read(1);
    }

    public void setNewCenterZ(double value) {
        this.handle.getDoubles().write(1, value);
    }

    public double getOldSize() {
        return this.handle.getDoubles().read(2);
    }

    public void setOldSize(double value) {
        this.handle.getDoubles().write(2, value);
    }

    public double getNewSize() {
        return this.handle.getDoubles().read(3);
    }

    public void setNewSize(double value) {
        this.handle.getDoubles().write(3, value);
    }

    public long getLerpTime() {
        return this.handle.getLongs().read(0);
    }

    public void setLerpTime(long value) {
        this.handle.getLongs().write(0, value);
    }

    public int getNewAbsoluteMaxSize() {
        return this.handle.getIntegers().read(0);
    }

    public void setNewAbsoluteMaxSize(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getWarningBlocks() {
        return this.handle.getIntegers().read(1);
    }

    public void setWarningBlocks(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getWarningTime() {
        return this.handle.getIntegers().read(2);
    }

    public void setWarningTime(int value) {
        this.handle.getIntegers().write(2, value);
    }


}
