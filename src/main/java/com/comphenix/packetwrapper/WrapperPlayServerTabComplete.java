package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerTabComplete extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TAB_COMPLETE;

    public WrapperPlayServerTabComplete() {
        super(TYPE);
    }

    public WrapperPlayServerTabComplete(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'suggestions'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'suggestions'
     */
    public InternalStructure getSuggestionsInternal() {
        return this.handle.getStructures().read(0); // TODO: No specific modifier has been found for type class com.mojang.brigadier.suggestion.Suggestions Generic type: class com.mojang.brigadier.suggestion.Suggestions
    }

    /**
     * Sets the value of field 'suggestions'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'suggestions'
     */
    public void setSuggestionsInternal(InternalStructure value) {
        this.handle.getStructures().write(0, value); // TODO: No specific modifier has been found for type class com.mojang.brigadier.suggestion.Suggestions Generic type: class com.mojang.brigadier.suggestion.Suggestions
    }

}
