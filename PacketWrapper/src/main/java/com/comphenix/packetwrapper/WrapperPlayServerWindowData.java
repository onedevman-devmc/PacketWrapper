package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerWindowData extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WINDOW_DATA;

    public WrapperPlayServerWindowData() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerWindowData(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getId() {
        return this.handle.getIntegers().read(1);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getValue() {
        return this.handle.getIntegers().read(2);
    }

    public void setValue(int value) {
        this.handle.getIntegers().write(2, value);
    }


}
