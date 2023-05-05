package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderCenter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_CENTER;

    public WrapperPlayServerSetBorderCenter() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSetBorderCenter(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getNewCenterX() {
        return this.handle.getDoubles().read(0);
    }

    public void setNewCenterX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getNewCenterZ() {
        return this.handle.getDoubles().read(1);
    }

    public void setNewCenterZ(double value) {
        this.handle.getDoubles().write(1, value);
    }


}
