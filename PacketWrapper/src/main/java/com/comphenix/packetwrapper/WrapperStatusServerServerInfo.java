package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedServerPing;

public class WrapperStatusServerServerInfo extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Status.Server.SERVER_INFO;

    public WrapperStatusServerServerInfo() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperStatusServerServerInfo(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedServerPing getStatus() {
        return this.handle.getServerPings().read(0);
    }

    public void setStatus(WrappedServerPing value) {
        this.handle.getServerPings().write(0, value);
    }


}
