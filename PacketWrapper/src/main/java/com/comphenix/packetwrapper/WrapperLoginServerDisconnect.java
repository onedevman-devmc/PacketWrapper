package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperLoginServerDisconnect extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Server.DISCONNECT;

    public WrapperLoginServerDisconnect() {
        super(TYPE);
    }

    public WrapperLoginServerDisconnect(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedChatComponent getReason() {
        return this.handle.getChatComponents().read(0);
    }

    public void setReason(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);

    }


}
