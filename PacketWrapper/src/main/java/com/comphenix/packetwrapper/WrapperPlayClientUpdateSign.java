package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayClientUpdateSign extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.UPDATE_SIGN;

    public WrapperPlayClientUpdateSign() {
        super(TYPE);
    }

    public WrapperPlayClientUpdateSign(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    public String[] getLines() {
        return this.handle.getStringArrays().read(0);
    }

    public void setLines(String[] value) {
        this.handle.getStringArrays().write(0, value);
    }


}
