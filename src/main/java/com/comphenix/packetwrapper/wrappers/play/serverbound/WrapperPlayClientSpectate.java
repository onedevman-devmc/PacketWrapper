package com.comphenix.packetwrapper.wrappers.play.serverbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.util.UUID;

public class WrapperPlayClientSpectate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SPECTATE;

    public WrapperPlayClientSpectate() {
        super(TYPE);
    }

    public WrapperPlayClientSpectate(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'uuid'
     *
     * @return 'uuid'
     */
    public UUID getUuid() {
        return this.handle.getUUIDs().read(0);
    }

    /**
     * Sets the value of field 'uuid'
     *
     * @param value New value for field 'uuid'
     */
    public void setUuid(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

}
