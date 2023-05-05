package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.nbt.NbtBase;

public class WrapperPlayServerNbtQuery extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.NBT_QUERY;

    public WrapperPlayServerNbtQuery() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerNbtQuery(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getTransactionId() {
        return this.handle.getIntegers().read(0);
    }

    public void setTransactionId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public NbtBase<?> getTag() {
        return this.handle.getNbtModifier().read(0);
    }

    public void setTag(NbtBase<?> value) {
        this.handle.getNbtModifier().write(0, value);
    }


}
