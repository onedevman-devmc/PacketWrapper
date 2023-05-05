package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ScoreboardAction;

public class WrapperPlayServerScoreboardScore extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_SCORE;

    public WrapperPlayServerScoreboardScore() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardScore(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getOwner() {
        return this.handle.getStrings().read(0);
    }

    public void setOwner(String value) {
        this.handle.getStrings().write(0, value);
    }

    public String getObjectiveName() {
        return this.handle.getStrings().read(1);
    }

    public void setObjectiveName(String value) {
        this.handle.getStrings().write(1, value);
    }

    public int getScore() {
        return this.handle.getIntegers().read(0);
    }

    public void setScore(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public ScoreboardAction getMethod() {
        return this.handle.getScoreboardActions().read(0);
    }

    public void setMethod(ScoreboardAction value) {
        this.handle.getScoreboardActions().write(0, value);
    }


}
