package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedBlockData;

public class WrapperPlayServerMultiBlockChange extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MULTI_BLOCK_CHANGE;

    public WrapperPlayServerMultiBlockChange() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerMultiBlockChange(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getSectionPos() {
        return this.handle.getSectionPositions().read(0);
    }

    public void setSectionPos(BlockPosition value) {
        this.handle.getSectionPositions().write(0, value);
    }

    public short[] getPositions() {
        return this.handle.getShortArrays().read(0);
    }

    public void setPositions(short[] value) {
        this.handle.getShortArrays().write(0, value);
    }

    public WrappedBlockData[] getStates() {
        return this.handle.getBlockDataArrays().read(0);
    }

    public void setStates(WrappedBlockData[] value) {
        this.handle.getBlockDataArrays().write(0, value);
    }

    public boolean getSuppressLightUpdates() {
        return this.handle.getBooleans().read(0);
    }

    public void setSuppressLightUpdates(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
