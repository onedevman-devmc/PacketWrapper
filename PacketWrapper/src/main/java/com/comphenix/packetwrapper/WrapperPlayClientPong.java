package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientPong extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.PONG;

    public WrapperPlayClientPong() {
        super(TYPE);
    }

    public WrapperPlayClientPong(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
