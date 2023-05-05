package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderLerpSize extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_LERP_SIZE;

    public WrapperPlayServerSetBorderLerpSize() {
        super(TYPE);
    }

    public WrapperPlayServerSetBorderLerpSize(PacketContainer packet) {
        super(packet, TYPE);
    }

    public double getOldSize() {
        return this.handle.getDoubles().read(0);
    }

    public void setOldSize(double value) {
        this.handle.getDoubles().write(0, value);
    }

    public double getNewSize() {
        return this.handle.getDoubles().read(1);
    }

    public void setNewSize(double value) {
        this.handle.getDoubles().write(1, value);
    }

    public long getLerpTime() {
        return this.handle.getLongs().read(0);
    }

    public void setLerpTime(long value) {
        this.handle.getLongs().write(0, value);
    }


}
