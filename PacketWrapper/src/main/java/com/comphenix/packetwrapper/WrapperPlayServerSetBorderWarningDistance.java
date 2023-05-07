package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderWarningDistance extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_WARNING_DISTANCE;

    public WrapperPlayServerSetBorderWarningDistance() {
        super(TYPE);
    }

    public WrapperPlayServerSetBorderWarningDistance(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'warningBlocks'
     *
     * @return 'warningBlocks'
     */
    public int getWarningBlocks() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'warningBlocks'
     *
     * @param value New value for field 'warningBlocks'
     */
    public void setWarningBlocks(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
