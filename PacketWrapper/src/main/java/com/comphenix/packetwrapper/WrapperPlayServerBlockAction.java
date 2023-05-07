package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.bukkit.Material;

public class WrapperPlayServerBlockAction extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_ACTION;

    public WrapperPlayServerBlockAction() {
        super(TYPE);
    }

    public WrapperPlayServerBlockAction(PacketContainer packet) {
        super(packet, TYPE);
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
     * Retrieves the value of field 'b0'
     *
     * @return 'b0'
     */
    public int getB0() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'b0'
     *
     * @param value New value for field 'b0'
     */
    public void setB0(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'b1'
     *
     * @return 'b1'
     */
    public int getB1() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'b1'
     *
     * @param value New value for field 'b1'
     */
    public void setB1(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'block'
     *
     * @return 'block'
     */
    public Material getBlock() {
        return this.handle.getBlocks().read(0);
    }

    /**
     * Sets the value of field 'block'
     *
     * @param value New value for field 'block'
     */
    public void setBlock(Material value) {
        this.handle.getBlocks().write(0, value);
    }

}
