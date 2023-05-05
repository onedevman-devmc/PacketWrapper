package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

import java.time.Instant;

public class WrapperPlayClientChatCommand extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CHAT_COMMAND;

    public WrapperPlayClientChatCommand() {
        super(TYPE);
    }

    public WrapperPlayClientChatCommand(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getCommand() {
        return this.handle.getStrings().read(0);
    }

    public void setCommand(String value) {
        this.handle.getStrings().write(0, value);
    }

    public Instant getTimeStamp() {
        return this.handle.getInstants().read(0);
    }

    public void setTimeStamp(Instant value) {
        this.handle.getInstants().write(0, value);
    }

    public long getSalt() {
        return this.handle.getLongs().read(0);
    }

    public void setSalt(long value) {
        this.handle.getLongs().write(0, value);
    }

    public Object getArgumentSignatures() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.commands.arguments.ArgumentSignatures
    }

    public void setArgumentSignatures(Object value) {
        this.handle.getModifier().write(0, value);
    }

    public Object getLastSeenMessages() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.LastSeenMessages$Update
    }

    public void setLastSeenMessages(Object value) {
        this.handle.getModifier().write(1, value);
    }


}
