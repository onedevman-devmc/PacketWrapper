package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerExperience extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.EXPERIENCE;

    public WrapperPlayServerExperience() {
        super(TYPE);
    }

    public WrapperPlayServerExperience(PacketContainer packet) {
        super(packet, TYPE);
    }

    public float getExperienceProgress() {
        return this.handle.getFloat().read(0);
    }

    public void setExperienceProgress(float value) {
        this.handle.getFloat().write(0, value);
    }

    public int getTotalExperience() {
        return this.handle.getIntegers().read(0);
    }

    public void setTotalExperience(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getExperienceLevel() {
        return this.handle.getIntegers().read(1);
    }

    public void setExperienceLevel(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
