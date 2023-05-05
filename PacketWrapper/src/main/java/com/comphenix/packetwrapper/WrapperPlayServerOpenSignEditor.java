package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerOpenSignEditor extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.OPEN_SIGN_EDITOR;

    public WrapperPlayServerOpenSignEditor() {
        super(TYPE);
    }

    public WrapperPlayServerOpenSignEditor(PacketContainer packet) {
        super(packet, TYPE);
    }

    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }


}
