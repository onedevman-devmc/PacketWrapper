package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityLook extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_LOOK;

    public WrapperPlayServerEntityLook() {
        super(TYPE);
    }

    public WrapperPlayServerEntityLook(PacketContainer packet) {
        super(packet, TYPE);
    }


}
