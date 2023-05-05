package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public class WrapperPlayClientUseItem extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.USE_ITEM;

    public WrapperPlayClientUseItem() {
        super(TYPE);
    }

    public WrapperPlayClientUseItem(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Hand getHand() {
        return this.handle.getHands().read(0);
    }

    public void setHand(Hand value) {
        this.handle.getHands().write(0, value);
    }

    public int getSequence() {
        return this.handle.getIntegers().read(0);
    }

    public void setSequence(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public long getTimestamp() {
        return this.handle.getLongs().read(0);
    }

    public void setTimestamp(long value) {
        this.handle.getLongs().write(0, value);
    }


}
