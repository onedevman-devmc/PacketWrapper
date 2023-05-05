package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;

import java.util.List;

public class WrapperPlayServerCustomChatCompletions extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.CUSTOM_CHAT_COMPLETIONS;

    public WrapperPlayServerCustomChatCompletions() {
        super(TYPE);
    }

    public WrapperPlayServerCustomChatCompletions(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getAction() {
        return this.handle.getModifier().read(0); // TODO: No modifier has been found for type class net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket$Action
    }

    public void setAction(Object value) {
        this.handle.getModifier().write(0, value);
    }

    public List<String> getEntries() {
        return this.handle.getLists(Converters.passthrough(String.class)).read(0);
    }

    public void setEntries(List<String> value) {
        this.handle.getLists(Converters.passthrough(String.class)).write(0, value);
    }


}
