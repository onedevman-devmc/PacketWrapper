package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperStatusServerPong extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Status.Server.PONG;

    public WrapperStatusServerPong() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperStatusServerPong(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getTime() {
        return this.handle.getLongs().read(0);
    }

    public void setTime(long value) {
        this.handle.getLongs().write(0, value);
    }


}
