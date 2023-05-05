package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerClearTitles extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CLEAR_TITLES;

    public WrapperPlayServerClearTitles() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerClearTitles(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getResetTimes() {
        return this.handle.getBooleans().read(0);
    }

    public void setResetTimes(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
