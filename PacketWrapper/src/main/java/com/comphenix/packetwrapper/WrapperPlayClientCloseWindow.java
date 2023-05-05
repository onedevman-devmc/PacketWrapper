package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientCloseWindow extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CLOSE_WINDOW;

    public WrapperPlayClientCloseWindow() {
        super(TYPE);
    }

    public WrapperPlayClientCloseWindow(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
