package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerPlayerCombatKill extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_COMBAT_KILL;

    public WrapperPlayServerPlayerCombatKill() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerPlayerCombatKill(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getPlayerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setPlayerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getKillerId() {
        return this.handle.getIntegers().read(1);
    }

    public void setKillerId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public WrappedChatComponent getMessage() {
        return this.handle.getChatComponents().read(0);
    }

    public void setMessage(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }


}
