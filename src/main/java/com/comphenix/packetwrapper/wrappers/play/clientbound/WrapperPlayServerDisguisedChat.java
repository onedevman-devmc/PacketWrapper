package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
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

    /**
     * Retrieves the value of field 'message'
     *
     * @return 'message'
     */
    public WrappedChatComponent getMessage() {
        return this.handle.getChatComponents().read(0);
    }

    /**
     * Sets the value of field 'message'
     *
     * @param value New value for field 'message'
     */
    public void setMessage(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    /**
     * Retrieves the value of field 'chatType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'chatType'
     */
    public InternalStructure getChatTypeInternal() {
        return this.handle.getStructures().read(1); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork Generic type: class net.minecraft.network.chat.ChatType$BoundNetwork
    }

    /**
     * Sets the value of field 'chatType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'chatType'
     */
    public void setChatTypeInternal(InternalStructure value) {
        this.handle.getStructures().write(1, value); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork Generic type: class net.minecraft.network.chat.ChatType$BoundNetwork
    }

}
