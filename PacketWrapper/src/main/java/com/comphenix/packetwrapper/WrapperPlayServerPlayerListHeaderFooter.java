package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerPlayerListHeaderFooter extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER;

    public WrapperPlayServerPlayerListHeaderFooter() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerPlayerListHeaderFooter(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedChatComponent getHeader() {
        return this.handle.getChatComponents().read(0);
    }

    public void setHeader(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);

    }

    public WrappedChatComponent getFooter() {
        return this.handle.getChatComponents().read(1);
    }

    public void setFooter(WrappedChatComponent value) {
        this.handle.getChatComponents().write(1, value);
    }

    /*
    public Object getAdventure$header() {
        return this.handle.getModifier().read(0); // TODO: No modifier has been found for type interface net.kyori.adventure.text.Component
    }

    public void setAdventure$header(Object value) {
        this.handle.getModifier().write(0, value);
    }

    public Object getAdventure$footer() {
        return this.handle.getModifier().read(1); // TODO: No modifier has been found for type interface net.kyori.adventure.text.Component
    }

    public void setAdventure$footer(Object value) {
        this.handle.getModifier().write(1, value);
    }
*/

}
