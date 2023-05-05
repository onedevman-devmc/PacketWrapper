package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;

public class WrapperPlayClientDifficultyChange extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.DIFFICULTY_CHANGE;

    public WrapperPlayClientDifficultyChange() {
        super(TYPE);
    }

    public WrapperPlayClientDifficultyChange(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Difficulty getDifficulty() {
        return this.handle.getDifficulties().read(0);
    }

    public void setDifficulty(Difficulty value) {
        this.handle.getDifficulties().write(0, value);
    }


}
