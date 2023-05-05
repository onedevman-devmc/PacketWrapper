package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperLoginServerSetCompression extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Server.SET_COMPRESSION;

    public WrapperLoginServerSetCompression() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperLoginServerSetCompression(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getCompressionThreshold() {
        return this.handle.getIntegers().read(0);
    }

    public void setCompressionThreshold(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
