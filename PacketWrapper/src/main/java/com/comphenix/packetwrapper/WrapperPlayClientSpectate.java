package com.comphenix.packetwrapper;

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

    public UUID getUuid() {
        return this.handle.getUUIDs().read(0);
    }

    public void setUuid(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }


}
