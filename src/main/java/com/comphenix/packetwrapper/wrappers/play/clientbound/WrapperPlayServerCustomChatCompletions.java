package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
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

    /**
     * Retrieves the value of field 'action'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'action'
     */
    public InternalStructure getActionInternal() {
        return this.handle.getStructures().read(0); // TODO: No specific modifier has been found for type class net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket$Action Generic type: class net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket$Action
    }

    /**
     * Sets the value of field 'action'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'action'
     */
    public void setActionInternal(InternalStructure value) {
        this.handle.getStructures().write(0, value); // TODO: No specific modifier has been found for type class net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket$Action Generic type: class net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket$Action
    }

    /**
     * Retrieves the value of field 'entries'
     *
     * @return 'entries'
     */
    public List<String> getEntries() {
        return this.handle.getLists(Converters.passthrough(String.class)).read(0);
    }

    /**
     * Sets the value of field 'entries'
     *
     * @param value New value for field 'entries'
     */
    public void setEntries(List<String> value) {
        this.handle.getLists(Converters.passthrough(String.class)).write(0, value);
    }

}
