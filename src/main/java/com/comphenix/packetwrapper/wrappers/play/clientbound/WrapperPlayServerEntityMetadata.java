package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedDataValue;

import java.util.List;

public class WrapperPlayServerEntityMetadata extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_METADATA;

    public WrapperPlayServerEntityMetadata() {
        super(TYPE);
    }

    public WrapperPlayServerEntityMetadata(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'packedItems'
     *
     * @return 'packedItems'
     */
    public List<WrappedDataValue> getPackedItems() {
        return this.handle.getDataValueCollectionModifier().read(0);
    }

    /**
     * Sets the value of field 'packedItems'
     *
     * @param value New value for field 'packedItems'
     */
    public void setPackedItems(List<WrappedDataValue> value) {
        this.handle.getDataValueCollectionModifier().write(0, value);
    }

}
