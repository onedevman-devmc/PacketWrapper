package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperStatusClientPing extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Status.Client.PING;

    public WrapperStatusClientPing() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperStatusClientPing(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getTime() {
        return this.handle.getLongs().read(0);
    }

    public void setTime(long value) {
        this.handle.getLongs().write(0, value);
    }


}
