package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;

public class WrapperPlayClientSetCommandBlock extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SET_COMMAND_BLOCK;

    public WrapperPlayClientSetCommandBlock() {
        super(TYPE);
    }

    public WrapperPlayClientSetCommandBlock(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public String getCommand() {
        return this.handle.getStrings().read(0);
    }

    public void setCommand(String value) {
        this.handle.getStrings().write(0, value);
    }

    public boolean getTrackOutput() {
        return this.handle.getBooleans().read(0);
    }

    public void setTrackOutput(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getConditional() {
        return this.handle.getBooleans().read(1);
    }

    public void setConditional(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public boolean getAutomatic() {
        return this.handle.getBooleans().read(2);
    }

    public void setAutomatic(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    public EnumWrappers.CommandBlockMode getMode() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.level.block.entity.CommandBlockEntity$Mode
    }

    public void setMode(EnumWrappers.CommandBlockMode value) {
        throw new UnsupportedOperationException();
    }


}
