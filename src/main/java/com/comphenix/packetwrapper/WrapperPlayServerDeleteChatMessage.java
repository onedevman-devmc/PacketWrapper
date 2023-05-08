package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerDeleteChatMessage extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.DELETE_CHAT_MESSAGE;

    public WrapperPlayServerDeleteChatMessage() {
        super(TYPE);
    }

    public WrapperPlayServerDeleteChatMessage(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'messageSignature'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'messageSignature'
     */
    public InternalStructure getMessageSignature() {
        return this.handle.getStructures().read(0); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.MessageSignature$Packed Generic type: class net.minecraft.network.chat.MessageSignature$Packed
    }

    /**
     * Sets the value of field 'messageSignature'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'messageSignature'
     */
    public void setMessageSignature(InternalStructure value) {
        this.handle.getStructures().write(0, value); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.MessageSignature$Packed Generic type: class net.minecraft.network.chat.MessageSignature$Packed
    }

}
