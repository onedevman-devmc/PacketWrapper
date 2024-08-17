package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderCenter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_CENTER;

    public WrapperPlayServerSetBorderCenter() {
        super(TYPE);
    }

    public WrapperPlayServerSetBorderCenter(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'newCenterX'
     *
     * @return 'newCenterX'
     */
    public double getNewCenterX() {
        return this.handle.getDoubles().read(0);
    }

    /**
     * Sets the value of field 'newCenterX'
     *
     * @param value New value for field 'newCenterX'
     */
    public void setNewCenterX(double value) {
        this.handle.getDoubles().write(0, value);
    }

    /**
     * Retrieves the value of field 'newCenterZ'
     *
     * @return 'newCenterZ'
     */
    public double getNewCenterZ() {
        return this.handle.getDoubles().read(1);
    }

    /**
     * Sets the value of field 'newCenterZ'
     *
     * @param value New value for field 'newCenterZ'
     */
    public void setNewCenterZ(double value) {
        this.handle.getDoubles().write(1, value);
    }

}
