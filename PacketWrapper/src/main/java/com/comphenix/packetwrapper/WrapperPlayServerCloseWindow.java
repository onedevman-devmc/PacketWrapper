package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCloseWindow extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CLOSE_WINDOW;

    public WrapperPlayServerCloseWindow() {
        super(TYPE);
    }

    public WrapperPlayServerCloseWindow(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
