package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerPlayerListHeaderFooter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER;

    public WrapperPlayServerPlayerListHeaderFooter() {
        super(TYPE);
    }

    public WrapperPlayServerPlayerListHeaderFooter(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'header'
     *
     * @return 'header'
     */
    public WrappedChatComponent getHeader() {
        return this.handle.getChatComponents().read(0);
    }

    /**
     * Sets the value of field 'header'
     *
     * @param value New value for field 'header'
     */
    public void setHeader(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    /**
     * Retrieves the value of field 'footer'
     *
     * @return 'footer'
     */
    public WrappedChatComponent getFooter() {
        return this.handle.getChatComponents().read(1);
    }

    /**
     * Sets the value of field 'footer'
     *
     * @param value New value for field 'footer'
     */
    public void setFooter(WrappedChatComponent value) {
        this.handle.getChatComponents().write(1, value);
    }

    /**
     * Retrieves the value of field 'adventure$header'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'adventure$header'
     */
    public InternalStructure getAdventure$header() {
        return this.handle.getStructures().read(2); // TODO: No specific modifier has been found for type interface net.kyori.adventure.text.Component Generic type: interface net.kyori.adventure.text.Component
    }

    /**
     * Sets the value of field 'adventure$header'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'adventure$header'
     */
    public void setAdventure$header(InternalStructure value) {
        this.handle.getStructures().write(2, value); // TODO: No specific modifier has been found for type interface net.kyori.adventure.text.Component Generic type: interface net.kyori.adventure.text.Component
    }

    /**
     * Retrieves the value of field 'adventure$footer'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'adventure$footer'
     */
    public InternalStructure getAdventure$footer() {
        return this.handle.getStructures().read(3); // TODO: No specific modifier has been found for type interface net.kyori.adventure.text.Component Generic type: interface net.kyori.adventure.text.Component
    }

    /**
     * Sets the value of field 'adventure$footer'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'adventure$footer'
     */
    public void setAdventure$footer(InternalStructure value) {
        this.handle.getStructures().write(3, value); // TODO: No specific modifier has been found for type interface net.kyori.adventure.text.Component Generic type: interface net.kyori.adventure.text.Component
    }

}
