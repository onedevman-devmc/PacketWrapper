package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateTime extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_TIME;

    public WrapperPlayServerUpdateTime() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateTime(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getGameTime() {
        return this.handle.getLongs().read(0);
    }

    public void setGameTime(long value) {
        this.handle.getLongs().write(0, value);
    }

    public long getDayTime() {
        return this.handle.getLongs().read(1);
    }

    public void setDayTime(long value) {
        this.handle.getLongs().write(1, value);
    }


}
