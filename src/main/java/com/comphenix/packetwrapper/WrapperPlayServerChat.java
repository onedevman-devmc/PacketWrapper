package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.wrappers.WrappedMessageSignature;

import java.util.UUID;

public class WrapperPlayServerChat extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CHAT;

    public WrapperPlayServerChat() {
        super(TYPE);
    }

    public WrapperPlayServerChat(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'sender'
     *
     * @return 'sender'
     */
    public UUID getSender() {
        return this.handle.getUUIDs().read(0);
    }

    /**
     * Sets the value of field 'sender'
     *
     * @param value New value for field 'sender'
     */
    public void setSender(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

    /**
     * Retrieves the value of field 'index'
     *
     * @return 'index'
     */
    public int getIndex() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'index'
     *
     * @param value New value for field 'index'
     */
    public void setIndex(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'signature'
     *
     * @return 'signature'
     */
    public WrappedMessageSignature getSignature() {
        return this.handle.getMessageSignatures().read(0);
    }

    /**
     * Sets the value of field 'signature'
     *
     * @param value New value for field 'signature'
     */
    public void setSignature(WrappedMessageSignature value) {
        this.handle.getMessageSignatures().write(0, value);
    }

    /**
     * Retrieves the value of field 'body'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'body'
     */
    public InternalStructure getBodyInternal() {
        return this.handle.getStructures().read(2); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.SignedMessageBody$Packed Generic type: class net.minecraft.network.chat.SignedMessageBody$Packed
    }

    /**
     * Sets the value of field 'body'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'body'
     */
    public void setBodyInternal(InternalStructure value) {
        this.handle.getStructures().write(2, value); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.SignedMessageBody$Packed Generic type: class net.minecraft.network.chat.SignedMessageBody$Packed
    }

    /**
     * Retrieves the value of field 'unsignedContent'
     *
     * @return 'unsignedContent'
     */
    public WrappedChatComponent getUnsignedContent() {
        return this.handle.getChatComponents().read(0);
    }

    /**
     * Sets the value of field 'unsignedContent'
     *
     * @param value New value for field 'unsignedContent'
     */
    public void setUnsignedContent(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    /**
     * Retrieves the value of field 'filterMask'
     *
     * @return 'filterMask'
     */
    public InternalStructure getFilterMaskInternal() {
        return this.handle.getStructures().read(4);
    }

    /**
     * Sets the value of field 'filterMask'
     *
     * @param value New value for field 'filterMask'
     */
    public void setFilterMaskInternal(InternalStructure value) {
        this.handle.getStructures().write(4, value);
    }

    /**
     * Retrieves the value of field 'chatType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'chatType'
     */
    public InternalStructure getChatTypeInternal() {
        return this.handle.getStructures().read(5); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork Generic type: class net.minecraft.network.chat.ChatType$BoundNetwork
    }

    /**
     * Sets the value of field 'chatType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'chatType'
     */
    public void setChatTypeInternal(InternalStructure value) {
        this.handle.getStructures().write(5, value); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork Generic type: class net.minecraft.network.chat.ChatType$BoundNetwork
    }

}
