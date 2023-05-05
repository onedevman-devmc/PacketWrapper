package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public class WrapperPlayServerOpenBook extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.OPEN_BOOK;

    public WrapperPlayServerOpenBook() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerOpenBook(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Hand getHand() {
        return this.handle.getHands().read(0);
    }

    public void setHand(Hand value) {
        this.handle.getHands().write(0, value);
    }


}
