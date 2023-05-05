package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientKeepAlive extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.KEEP_ALIVE;

    public WrapperPlayClientKeepAlive() {
        super(TYPE);
    }

    public WrapperPlayClientKeepAlive(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getId() {
        return this.handle.getLongs().read(0);
    }

    public void setId(long value) {
        this.handle.getLongs().write(0, value);
    }


}
