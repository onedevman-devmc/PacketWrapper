package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerWorldEvent extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.WORLD_EVENT;

    public WrapperPlayServerWorldEvent() {
        super(TYPE);
    }

    public WrapperPlayServerWorldEvent(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getType() {
        return this.handle.getIntegers().read(0);
    }

    public void setType(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public int getData() {
        return this.handle.getIntegers().read(1);
    }

    public void setData(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public boolean getGlobalEvent() {
        return this.handle.getBooleans().read(0);
    }

    public void setGlobalEvent(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
