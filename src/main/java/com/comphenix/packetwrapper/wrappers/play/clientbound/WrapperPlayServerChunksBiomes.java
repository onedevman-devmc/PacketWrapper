package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.List;

public class WrapperPlayServerChunksBiomes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CHUNKS_BIOMES;

    public WrapperPlayServerChunksBiomes() {
        super(TYPE);
    }

    public WrapperPlayServerChunksBiomes(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'chunkBiomeData'
     *
     * @return 'chunkBiomeData'
     */
    public List<InternalStructure> getChunkBiomeData() {
        return this.handle.getLists(InternalStructure.getConverter()).read(0); // TODO: Multiple modifier have been found for type interface java.util.List Generic type: [class net.minecraft.network.protocol.game.ClientboundChunksBiomesPacket$ChunkBiomeData]
    }

    /**
     * Sets the value of field 'chunkBiomeData'
     *
     * @param value New value for field 'chunkBiomeData'
     */
    public void setChunkBiomeData(List<InternalStructure> value) {
        this.handle.getLists(InternalStructure.getConverter()).write(0, value);
    }

}
