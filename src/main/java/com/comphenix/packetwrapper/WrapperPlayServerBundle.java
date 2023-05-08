package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBundle extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BUNDLE;

    public WrapperPlayServerBundle() {
        super(TYPE);
    }

    public WrapperPlayServerBundle(PacketContainer packet) {
        super(packet, TYPE);
    }


}
