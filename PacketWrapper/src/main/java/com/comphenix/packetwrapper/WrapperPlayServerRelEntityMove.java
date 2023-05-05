package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerRelEntityMove extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.REL_ENTITY_MOVE;

    public WrapperPlayServerRelEntityMove() {
        super(TYPE);
    }

    public WrapperPlayServerRelEntityMove(PacketContainer packet) {
        super(packet, TYPE);
    }


}
