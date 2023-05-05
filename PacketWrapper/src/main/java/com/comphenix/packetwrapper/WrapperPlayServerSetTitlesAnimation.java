package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetTitlesAnimation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_TITLES_ANIMATION;

    public WrapperPlayServerSetTitlesAnimation() {
        super(TYPE);
    }

    public WrapperPlayServerSetTitlesAnimation(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getFadeIn() {
        return this.handle.getIntegers().read(0);
    }

    public void setFadeIn(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getStay() {
        return this.handle.getIntegers().read(1);
    }

    public void setStay(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getFadeOut() {
        return this.handle.getIntegers().read(2);
    }

    public void setFadeOut(int value) {
        this.handle.getIntegers().write(2, value);
    }


}
