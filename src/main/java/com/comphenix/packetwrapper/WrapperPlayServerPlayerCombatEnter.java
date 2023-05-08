package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerPlayerCombatEnter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_COMBAT_ENTER;

    public WrapperPlayServerPlayerCombatEnter() {
        super(TYPE);
    }

    public WrapperPlayServerPlayerCombatEnter(PacketContainer packet) {
        super(packet, TYPE);
    }


}
