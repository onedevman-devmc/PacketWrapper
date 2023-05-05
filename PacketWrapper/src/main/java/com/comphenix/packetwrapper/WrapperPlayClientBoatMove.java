package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientBoatMove extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.BOAT_MOVE;

    public WrapperPlayClientBoatMove() {
        super(TYPE);
    }

    public WrapperPlayClientBoatMove(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getLeft() {
        return this.handle.getBooleans().read(0);
    }

    public void setLeft(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getRight() {
        return this.handle.getBooleans().read(1);
    }

    public void setRight(boolean value) {
        this.handle.getBooleans().write(1, value);
    }


}
