package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientTabComplete extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.TAB_COMPLETE;

    public WrapperPlayClientTabComplete() {
        super(TYPE);
    }

    public WrapperPlayClientTabComplete(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public String getCommand() {
        return this.handle.getStrings().read(0);
    }

    public void setCommand(String value) {
        this.handle.getStrings().write(0, value);
    }


}
