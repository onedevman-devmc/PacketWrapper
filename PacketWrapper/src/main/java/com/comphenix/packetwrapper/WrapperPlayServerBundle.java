package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerBundle extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.BUNDLE;

    public WrapperPlayServerBundle() {
        super(TYPE);
    }

    public WrapperPlayServerBundle(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Iterable<PacketContainer> getPackets() {
        return this.handle.getPacketBundles().read(0);
    }

    public void setPackets(Iterable<PacketContainer> value) {
        this.handle.getPacketBundles().write(0, value);
    }


}
