package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerScoreboardDisplayObjective extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_DISPLAY_OBJECTIVE;

    public WrapperPlayServerScoreboardDisplayObjective() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardDisplayObjective(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }

    public void setSlot(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public String getObjectiveName() {
        return this.handle.getStrings().read(0);
    }

    public void setObjectiveName(String value) {
        this.handle.getStrings().write(0, value);
    }


}
