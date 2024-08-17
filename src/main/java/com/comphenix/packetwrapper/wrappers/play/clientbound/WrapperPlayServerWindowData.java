package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerWindowData extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WINDOW_DATA;

    public WrapperPlayServerWindowData() {
        super(TYPE);
    }

    public WrapperPlayServerWindowData(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'containerId'
     *
     * @return 'containerId'
     */
    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'containerId'
     *
     * @param value New value for field 'containerId'
     */
    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public int getId() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'value'
     *
     * @return 'value'
     */
    public int getValue() {
        return this.handle.getIntegers().read(2);
    }

    /**
     * Sets the value of field 'value'
     *
     * @param value New value for field 'value'
     */
    public void setValue(int value) {
        this.handle.getIntegers().write(2, value);
    }

}
