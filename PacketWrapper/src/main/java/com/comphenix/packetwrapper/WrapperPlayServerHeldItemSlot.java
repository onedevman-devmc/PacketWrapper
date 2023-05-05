package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerHeldItemSlot extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.HELD_ITEM_SLOT;

    public WrapperPlayServerHeldItemSlot() {
        super(TYPE);
    }

    public WrapperPlayServerHeldItemSlot(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }

    public void setSlot(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
