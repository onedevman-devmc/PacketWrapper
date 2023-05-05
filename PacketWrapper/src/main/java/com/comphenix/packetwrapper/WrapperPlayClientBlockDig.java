package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;

public class WrapperPlayClientBlockDig extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.BLOCK_DIG;

    public WrapperPlayClientBlockDig() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientBlockDig(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public Direction getDirection() {
        return this.handle.getDirections().read(0);
    }

    public void setDirection(Direction value) {
        this.handle.getDirections().write(0, value);
    }

    public PlayerDigType getAction() {
        return this.handle.getPlayerDigTypes().read(0);
    }

    public void setAction(PlayerDigType value) {
        this.handle.getPlayerDigTypes().write(0, value);
    }

    public int getSequence() {
        return this.handle.getIntegers().read(0);
    }

    public void setSequence(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
