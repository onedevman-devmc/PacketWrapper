package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

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
    public Map getTags() {
        return this.handle.getStatisticMaps().read(0);
    }

    /**
     * Sets the value of field 'tags'
     *
     * @param value New value for field 'tags'
     */
    public void setTags(Map value) {
        this.handle.getStatisticMaps().write(0, value);
    }

}
