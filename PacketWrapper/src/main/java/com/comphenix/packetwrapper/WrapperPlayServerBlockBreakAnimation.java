package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerBlockBreakAnimation extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_BREAK_ANIMATION;

    public WrapperPlayServerBlockBreakAnimation() {
        super(TYPE);
    }

    public WrapperPlayServerBlockBreakAnimation(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'pos'
     *
     * @return 'pos'
     */
    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    /**
     * Sets the value of field 'pos'
     *
     * @param value New value for field 'pos'
     */
    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    /**
     * Retrieves the value of field 'progress'
     *
     * @return 'progress'
     */
    public int getProgress() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'progress'
     *
     * @param value New value for field 'progress'
     */
    public void setProgress(int value) {
        this.handle.getIntegers().write(1, value);
    }

}
