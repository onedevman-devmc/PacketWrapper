package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.bukkit.Material;

public class WrapperPlayServerBlockAction extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BLOCK_ACTION;

    public WrapperPlayServerBlockAction() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerBlockAction(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public int getB0() {
        return this.handle.getIntegers().read(0);
    }

    public void setB0(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getB1() {
        return this.handle.getIntegers().read(1);
    }

    public void setB1(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public Material getBlock() {
        return this.handle.getBlocks().read(0);
    }

    public void setBlock(Material value) {
        this.handle.getBlocks().write(0, value);
    }


}
