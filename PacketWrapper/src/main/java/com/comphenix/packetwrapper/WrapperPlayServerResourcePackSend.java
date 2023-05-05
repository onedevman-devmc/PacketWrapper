package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerResourcePackSend extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RESOURCE_PACK_SEND;

    public WrapperPlayServerResourcePackSend() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerResourcePackSend(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getUrl() {
        return this.handle.getStrings().read(0);
    }

    public void setUrl(String value) {
        this.handle.getStrings().write(0, value);
    }

    public String getHash() {
        return this.handle.getStrings().read(1);
    }

    public void setHash(String value) {
        this.handle.getStrings().write(1, value);
    }

    public boolean getRequired() {
        return this.handle.getBooleans().read(0);
    }

    public void setRequired(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public Object getPrompt() {
        return this.handle.getChatComponents().read(0);
    }

    public void setPrompt(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }


}
