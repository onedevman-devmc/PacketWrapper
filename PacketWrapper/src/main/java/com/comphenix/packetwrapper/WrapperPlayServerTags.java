package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedStatistic;

import java.util.Map;

public class WrapperPlayServerTags extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TAGS;

    public WrapperPlayServerTags() {
        super(TYPE);
    }

    public WrapperPlayServerTags(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Map<WrappedStatistic, Integer> getTags() {
        return this.handle.getStatisticMaps().read(0);
    }

    public void setTags(Map<WrappedStatistic, Integer> value) {
        this.handle.getStatisticMaps().write(0, value);
    }


}
