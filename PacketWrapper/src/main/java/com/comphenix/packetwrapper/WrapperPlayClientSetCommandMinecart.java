package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientSetCommandMinecart extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SET_COMMAND_MINECART;

    public WrapperPlayClientSetCommandMinecart() {
        super(TYPE);
    }

    public WrapperPlayClientSetCommandMinecart(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntity() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntity(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public String getCommand() {
        return this.handle.getStrings().read(0);
    }

    public void setCommand(String value) {
        this.handle.getStrings().write(0, value);
    }

    public boolean getTrackOutput() {
        return this.handle.getBooleans().read(0);
    }

    public void setTrackOutput(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
