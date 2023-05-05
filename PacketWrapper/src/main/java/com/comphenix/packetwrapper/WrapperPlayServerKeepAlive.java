package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerKeepAlive extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.KEEP_ALIVE;

    public WrapperPlayServerKeepAlive() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerKeepAlive(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getId() {
        return this.handle.getLongs().read(0);
    }

    public void setId(long value) {
        this.handle.getLongs().write(0, value);
    }


}
