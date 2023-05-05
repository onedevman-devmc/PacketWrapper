package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientDifficultyLock extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.DIFFICULTY_LOCK;

    public WrapperPlayClientDifficultyLock() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientDifficultyLock(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getLocked() {
        return this.handle.getBooleans().read(0);
    }

    public void setLocked(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
