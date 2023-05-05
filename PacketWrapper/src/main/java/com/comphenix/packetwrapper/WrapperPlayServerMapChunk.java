package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedLevelChunkData.ChunkData;
import com.comphenix.protocol.wrappers.WrappedLevelChunkData.LightData;

public class WrapperPlayServerMapChunk extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MAP_CHUNK;

    public WrapperPlayServerMapChunk() {
        super(TYPE);
    }

    public WrapperPlayServerMapChunk(PacketContainer packet) {
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

    public ChunkData getChunkData() {
        return this.handle.getLevelChunkData().read(0);
    }

    public void setChunkData(ChunkData value) {
        this.handle.getLevelChunkData().write(0, value);
    }

    public LightData getLightData() {
        return this.handle.getLightUpdateData().read(0);
    }

    public void setLightData(LightData value) {
        this.handle.getLightUpdateData().write(0, value);
    }

    public boolean getReady() {
        return this.handle.getBooleans().read(0);
    }

    public void setReady(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
