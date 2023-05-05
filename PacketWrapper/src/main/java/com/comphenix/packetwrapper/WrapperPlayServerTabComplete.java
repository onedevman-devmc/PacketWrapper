package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerTabComplete extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.TAB_COMPLETE;

    public WrapperPlayServerTabComplete() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerTabComplete(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getSuggestions() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class com.mojang.brigadier.suggestion.Suggestions
    }

    public void setSuggestions(Object value) {
        throw new UnsupportedOperationException();
    }


}
