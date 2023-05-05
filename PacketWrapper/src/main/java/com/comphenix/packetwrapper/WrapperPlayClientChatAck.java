package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientChatAck extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CHAT_ACK;

    public WrapperPlayClientChatAck() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientChatAck(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getOffset() {
        return this.handle.getIntegers().read(0);
    }

    public void setOffset(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
