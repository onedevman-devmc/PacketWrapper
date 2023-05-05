package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientBeacon extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.BEACON;

    public WrapperPlayClientBeacon() {
        super(TYPE);
    }

    public WrapperPlayClientBeacon(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getPrimary() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class java.util.Optional
    }

    public void setPrimary(Object value) {
        this.handle.getModifier().write(0, value);
    }

    public Object getSecondary() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class java.util.Optional
    }

    public void setSecondary(Object value) {
        this.handle.getModifier().write(1, value);
    }


}
