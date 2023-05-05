package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperStatusClientStart extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Status.Client.START;

    public WrapperStatusClientStart() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperStatusClientStart(PacketContainer packet) {
        super(packet, TYPE);
    }


}
