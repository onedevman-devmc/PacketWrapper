package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedLevelChunkData.LightData;

public class WrapperPlayServerLightUpdate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.LIGHT_UPDATE;

    public WrapperPlayServerLightUpdate() {
        super(TYPE);
    }

    public WrapperPlayServerLightUpdate(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getX() {
        return this.handle.getIntegers().read(0);
    }

    public void setX(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getZ() {
        return this.handle.getIntegers().read(1);
    }

    public void setZ(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public LightData getLightData() {
        return this.handle.getLightUpdateData().read(0);
    }

    public void setLightData(LightData value) {
        this.handle.getLightUpdateData().write(0, value);
    }


}
