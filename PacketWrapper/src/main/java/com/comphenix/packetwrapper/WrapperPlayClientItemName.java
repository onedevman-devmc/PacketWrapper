package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientItemName extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ITEM_NAME;

    public WrapperPlayClientItemName() {
        super(TYPE);
    }

    public WrapperPlayClientItemName(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getName() {
        return this.handle.getStrings().read(0);
    }

    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }


}
