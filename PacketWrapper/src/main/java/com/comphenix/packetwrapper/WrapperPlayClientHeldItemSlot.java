package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientHeldItemSlot extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.HELD_ITEM_SLOT;

    public WrapperPlayClientHeldItemSlot() {
        super(TYPE);
    }

    public WrapperPlayClientHeldItemSlot(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }

    public void setSlot(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
