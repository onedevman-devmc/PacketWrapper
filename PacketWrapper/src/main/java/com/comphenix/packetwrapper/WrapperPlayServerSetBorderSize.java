package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderSize extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_SIZE;

    public WrapperPlayServerSetBorderSize() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSetBorderSize(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getSize() {
        return this.handle.getDoubles().read(0);
    }

    public void setSize(double value) {
        this.handle.getDoubles().write(0, value);
    }


}
