package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerGameStateChange extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.GAME_STATE_CHANGE;

    public WrapperPlayServerGameStateChange() {
        super(TYPE);
    }

    public WrapperPlayServerGameStateChange(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Integer getEvent() {
        return this.handle.getGameStateIDs().read(0);
    }

    public void setEvent(Integer value) {
        this.handle.getGameStateIDs().write(0, value);
    }

    public float getParam() {
        return this.handle.getFloat().read(0);
    }

    public void setParam(float value) {
        this.handle.getFloat().write(0, value);
    }


}
