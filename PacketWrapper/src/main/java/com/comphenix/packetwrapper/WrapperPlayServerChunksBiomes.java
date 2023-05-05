package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerChunksBiomes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CHUNKS_BIOMES;

    public WrapperPlayServerChunksBiomes() {
        super(TYPE);
    }

    public WrapperPlayServerChunksBiomes(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getChunkBiomeData() {
        throw new UnsupportedOperationException(); // TODO
    }

    public void setChunkBiomeData(Object value) {
        throw new UnsupportedOperationException(); // TODO

    }


}
