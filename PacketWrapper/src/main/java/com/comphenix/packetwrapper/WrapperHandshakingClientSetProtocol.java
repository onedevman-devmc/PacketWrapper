package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.PacketType.Protocol;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperHandshakingClientSetProtocol extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Handshake.Client.SET_PROTOCOL;

    public WrapperHandshakingClientSetProtocol() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperHandshakingClientSetProtocol(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getProtocolVersion() {
        return this.handle.getIntegers().read(0);
    }

    public void setProtocolVersion(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public String getHostName() {
        return this.handle.getStrings().read(0);
    }

    public void setHostName(String value) {
        this.handle.getStrings().write(0, value);
    }

    public int getPort() {
        return this.handle.getIntegers().read(1);
    }

    public void setPort(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public Protocol getIntention() {
        return this.handle.getProtocols().read(0);
    }

    public void setIntention(Protocol value) {
        this.handle.getProtocols().write(0, value);
    }


}
