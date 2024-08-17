package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateSimulationDistance extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_SIMULATION_DISTANCE;

    public WrapperPlayServerUpdateSimulationDistance() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateSimulationDistance(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'simulationDistance'
     *
     * @return 'simulationDistance'
     */
    public int getSimulationDistance() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'simulationDistance'
     *
     * @param value New value for field 'simulationDistance'
     */
    public void setSimulationDistance(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
