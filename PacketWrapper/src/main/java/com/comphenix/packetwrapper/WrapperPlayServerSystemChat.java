package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSystemChat extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SYSTEM_CHAT;

    public WrapperPlayServerSystemChat() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSystemChat(PacketContainer packet) {
        super(packet, TYPE);
    }

    /*public Object getAdventure$content() {
        return this.handle.getModifier().read(0); // TODO: No modifier has been found for type interface net.kyori.adventure.text.Component
    }

    public void setAdventure$content(Object value) {
        this.handle.getModifier().write(0, value);
    }*/

    public String getContent() {
        return this.handle.getStrings().read(0);
    }

    public void setContent(String value) {
        this.handle.getStrings().write(0, value);
    }

    public boolean getOverlay() {
        return this.handle.getBooleans().read(0);
    }

    public void setOverlay(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

}
