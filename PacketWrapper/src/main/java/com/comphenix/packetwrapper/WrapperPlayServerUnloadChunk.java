package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUnloadChunk extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UNLOAD_CHUNK;

    public WrapperPlayServerUnloadChunk() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerUnloadChunk(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getX() {
        return this.handle.getIntegers().read(0);
    }

    public void setX(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getZ() {
        return this.handle.getIntegers().read(1);
    }

    public void setZ(int value) {
        this.handle.getIntegers().write(1, value);
    }


}
