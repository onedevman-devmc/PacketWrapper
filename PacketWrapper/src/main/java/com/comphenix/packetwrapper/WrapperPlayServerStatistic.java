package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.util.Map;

public class WrapperPlayServerStatistic extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.STATISTIC;

    public WrapperPlayServerStatistic() {
        super(TYPE);
    }

    public WrapperPlayServerStatistic(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'stats'
     *
     * @return 'stats'
     */
    public Map getStats() {
        return this.handle.getStatisticMaps().read(0);
    }

    /**
     * Sets the value of field 'stats'
     *
     * @param value New value for field 'stats'
     */
    public void setStats(Map value) {
        this.handle.getStatisticMaps().write(0, value);
    }

}
