package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerOpenWindowHorse extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.OPEN_WINDOW_HORSE;

    public WrapperPlayServerOpenWindowHorse() {
        super(TYPE);
    }

    public WrapperPlayServerOpenWindowHorse(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getSize() {
        return this.handle.getIntegers().read(1);
    }

    public void setSize(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(2);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(2, value);
    }


}
