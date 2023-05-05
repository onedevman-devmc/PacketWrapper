package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCollect extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.COLLECT;

    public WrapperPlayServerCollect() {
        super(TYPE);
    }

    public WrapperPlayServerCollect(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getItemId() {
        return this.handle.getIntegers().read(0);
    }

    public void setItemId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getPlayerId() {
        return this.handle.getIntegers().read(1);
    }

    public void setPlayerId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getAmount() {
        return this.handle.getIntegers().read(2);
    }

    public void setAmount(int value) {
        this.handle.getIntegers().write(2, value);
    }


}
