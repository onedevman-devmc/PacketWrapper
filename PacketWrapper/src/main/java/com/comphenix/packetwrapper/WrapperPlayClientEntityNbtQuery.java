package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientEntityNbtQuery extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ENTITY_NBT_QUERY;

    public WrapperPlayClientEntityNbtQuery() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientEntityNbtQuery(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }

    public void setTransactionId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(1);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
