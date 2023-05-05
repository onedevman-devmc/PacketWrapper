package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerSetTitleText extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_TITLE_TEXT;

    public WrapperPlayServerSetTitleText() {
        super(TYPE);
    }

    public WrapperPlayServerSetTitleText(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedChatComponent getText() {
        return this.handle.getChatComponents().read(0);
    }

    public void setText(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    /*
    public Object getAdventure$text() {
        return this.handle.getModifier().read(0); // TODO: No modifier has been found for type interface net.kyori.adventure.text.Component
    }

    public void setAdventure$text(Object value) {
        this.handle.getModifier().write(0, value);
    }

    public Object getComponents() {
        return this.handle.getModifier().read(1); // TODO: No modifier has been found for type class [Lnet.md_5.bungee.api.chat.BaseComponent;
    }

    public void setComponents(Object value) {
        this.handle.getModifier().write(1, value);
    }
*/

}
