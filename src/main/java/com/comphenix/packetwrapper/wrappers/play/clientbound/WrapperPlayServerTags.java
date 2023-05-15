package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.Map;

public class WrapperPlayServerTags extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TAGS;

    public WrapperPlayServerTags() {
        super(TYPE);
    }

    public WrapperPlayServerTags(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'tags'
     *
     * @return 'tags'
     */
    public Map<MinecraftKey, InternalStructure> getTags() {
        return this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'tags'
     *
     * @param value New value for field 'tags'
     */
    public void setTags(Map<MinecraftKey, InternalStructure> value) {
        this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).write(0, value);
    }

}
