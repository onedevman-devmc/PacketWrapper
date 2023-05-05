package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientTrSel extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.TR_SEL;

    public WrapperPlayClientTrSel() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientTrSel(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getItem() {
        return this.handle.getIntegers().read(0);
    }

    public void setItem(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
