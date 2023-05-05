package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerCommands extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.COMMANDS;

    public WrapperPlayServerCommands() {
        super(TYPE);
    }

    public WrapperPlayServerCommands(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getRootIndex() {
        return this.handle.getIntegers().read(0);
    }

    public void setRootIndex(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getEntries() {
// Generic field type: [class net.minecraft.network.protocol.game.ClientboundCommandsPacket$Entry]//
        throw new UnsupportedOperationException(); // TODO
    }

    public void setEntries(Object value) {
        throw new UnsupportedOperationException(); // TODO
    }


}
