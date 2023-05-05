package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerBlockBreakAnimation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_BREAK_ANIMATION;

    public WrapperPlayServerBlockBreakAnimation() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerBlockBreakAnimation(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public int getProgress() {
        return this.handle.getIntegers().read(1);
    }

    public void setProgress(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
