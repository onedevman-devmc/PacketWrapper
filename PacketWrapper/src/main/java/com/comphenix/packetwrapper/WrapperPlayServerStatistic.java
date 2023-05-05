package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedStatistic;

import java.util.Map;

public class WrapperPlayServerStatistic extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.STATISTIC;

    public WrapperPlayServerStatistic() {
        super(TYPE);
    }

    public WrapperPlayServerStatistic(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Map<WrappedStatistic, Integer> getStats() {
        return this.handle.getStatisticMaps().read(0);
    }

    public void setStats(Map<WrappedStatistic, Integer> value) {
        this.handle.getStatisticMaps().write(0, value);
    }


}
