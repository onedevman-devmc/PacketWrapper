package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerDisguisedChat extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.DISGUISED_CHAT;

    public WrapperPlayServerDisguisedChat() {
        super(TYPE);
    }

    public WrapperPlayServerDisguisedChat(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getMessage() {
        return this.handle.getChatComponents().read(0);
    }

    public void setMessage(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    public Object getChatType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork
    }

    public void setChatType(Object value) {
        throw new UnsupportedOperationException();
    }


}
