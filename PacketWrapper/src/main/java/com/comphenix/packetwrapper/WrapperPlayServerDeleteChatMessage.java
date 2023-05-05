package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerDeleteChatMessage extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.DELETE_CHAT_MESSAGE;

    public WrapperPlayServerDeleteChatMessage() {
        super(TYPE);
    }

    public WrapperPlayServerDeleteChatMessage(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getMessageSignature() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.MessageSignature$Packed
    }

    public void setMessageSignature(Object value) {
        throw new UnsupportedOperationException();
    }


}
