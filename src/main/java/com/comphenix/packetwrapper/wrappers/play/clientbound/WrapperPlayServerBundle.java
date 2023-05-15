package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
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
