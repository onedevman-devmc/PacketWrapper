package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.WrappedAttribute;

import java.util.List;

public class WrapperPlayServerUpdateAttributes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_ATTRIBUTES;

    public WrapperPlayServerUpdateAttributes() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateAttributes(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'entityId'
     *
     * @return 'entityId'
     */
    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entityId'
     *
     * @param value New value for field 'entityId'
     */
    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'attributes'
     *
     * @return 'attributes'
     */
    public List<WrappedAttribute> getAttributes() {
        return this.handle.getLists(BukkitConverters.getWrappedAttributeConverter()).read(0);
    }

    /**
     * Sets the value of field 'attributes'
     *
     * @param value New value for field 'attributes'
     */
    public void setAttributes(List<WrappedAttribute> value) {
        this.handle.getLists(BukkitConverters.getWrappedAttributeConverter()).write(0, value);
    }

}
