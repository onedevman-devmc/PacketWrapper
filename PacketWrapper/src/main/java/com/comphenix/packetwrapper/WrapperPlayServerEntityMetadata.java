package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedDataValue;

import java.util.List;

public class WrapperPlayServerEntityMetadata extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_METADATA;

    public WrapperPlayServerEntityMetadata() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerEntityMetadata(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public List<WrappedDataValue> getPackedItems() {
        return this.handle.getDataValueCollectionModifier().read(0);
    }

    public void setPackedItems(List<WrappedDataValue> value) {
        this.handle.getDataValueCollectionModifier().write(0, value);
    }


}
