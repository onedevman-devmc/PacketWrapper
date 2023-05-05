package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayClientJigsawGenerate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.JIGSAW_GENERATE;

    public WrapperPlayClientJigsawGenerate() {
        super(TYPE);
    }

    public WrapperPlayClientJigsawGenerate(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public int getLevels() {
        return this.handle.getIntegers().read(0);
    }

    public void setLevels(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public boolean getKeepJigsaws() {
        return this.handle.getBooleans().read(0);
    }

    public void setKeepJigsaws(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
