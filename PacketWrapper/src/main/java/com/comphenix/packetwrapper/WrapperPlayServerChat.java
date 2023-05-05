package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.wrappers.WrappedMessageSignature;

import java.util.UUID;

public class WrapperPlayServerChat extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CHAT;

    public WrapperPlayServerChat() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerChat(PacketContainer packet) {
        super(packet, TYPE);
    }

    public UUID getSender() {
        return this.handle.getUUIDs().read(0);
    }

    public void setSender(UUID value) {
        this.handle.getUUIDs().write(0, value);
    }

    public int getIndex() {
        return this.handle.getIntegers().read(0);
    }

    public void setIndex(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public WrappedMessageSignature getSignature() {
        return this.handle.getMessageSignatures().read(0);
    }

    public void setSignature(WrappedMessageSignature value) {
        this.handle.getMessageSignatures().write(0, value);
    }

    public Object getBody() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.SignedMessageBody$Packed
    }

    public void setBody(Object value) {
        throw new UnsupportedOperationException();
    }

    public WrappedChatComponent getUnsignedContent() {
        return this.handle.getChatComponents().read(0);
    }

    public void setUnsignedContent(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    public Object getFilterMask() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.FilterMask
    }

    public void setFilterMask(Object value) {
        throw new UnsupportedOperationException();
    }

    public Object getChatType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.ChatType$BoundNetwork
    }

    public void setChatType(Object value) {
        throw new UnsupportedOperationException();
    }


}
