package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerPlayerCombatEnd extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_COMBAT_END;

    public WrapperPlayServerPlayerCombatEnd() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerPlayerCombatEnd(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getKillerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setKillerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getDuration() {
        return this.handle.getIntegers().read(1);
    }

    public void setDuration(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
