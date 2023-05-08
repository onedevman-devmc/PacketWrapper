package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerRelEntityMoveLook extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.REL_ENTITY_MOVE_LOOK;

    public WrapperPlayServerRelEntityMoveLook() {
        super(TYPE);
    }

    public WrapperPlayServerRelEntityMoveLook(PacketContainer packet) {
        super(packet, TYPE);
    }


}
