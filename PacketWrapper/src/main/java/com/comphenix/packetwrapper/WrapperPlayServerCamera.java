package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCamera extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CAMERA;

    public WrapperPlayServerCamera() {
        super(TYPE);
    }

    public WrapperPlayServerCamera(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'cameraId'
     *
     * @return 'cameraId'
     */
    public int getCameraId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'cameraId'
     *
     * @param value New value for field 'cameraId'
     */
    public void setCameraId(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
