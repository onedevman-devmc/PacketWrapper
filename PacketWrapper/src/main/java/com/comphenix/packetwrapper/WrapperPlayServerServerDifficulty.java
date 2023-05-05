package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;

public class WrapperPlayServerServerDifficulty extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SERVER_DIFFICULTY;

    public WrapperPlayServerServerDifficulty() {
        super(TYPE);
    }

    public WrapperPlayServerServerDifficulty(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Difficulty getDifficulty() {
        return this.handle.getDifficulties().read(0);
    }

    public void setDifficulty(Difficulty value) {
        this.handle.getDifficulties().write(0, value);
    }

    public boolean getLocked() {
        return this.handle.getBooleans().read(0);
    }

    public void setLocked(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
