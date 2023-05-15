package com.comphenix.packetwrapper.wrappers.play.serverbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
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

    /**
     * Retrieves the value of field 'command'
     *
     * @return 'command'
     */
    public String getCommand() {
        return this.handle.getStrings().read(0);

    }

    /**
     * Sets the value of field 'command'
     *
     * @param value New value for field 'command'
     */
    public void setCommand(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'timeStamp'
     *
     * @return 'timeStamp'
     */
    public Instant getTimeStamp() {
        return this.handle.getInstants().read(0);
    }

    /**
     * Sets the value of field 'timeStamp'
     *
     * @param value New value for field 'timeStamp'
     */
    public void setTimeStamp(Instant value) {
        this.handle.getInstants().write(0, value);
    }

    /**
     * Retrieves the value of field 'salt'
     *
     * @return 'salt'
     */
    public long getSalt() {
        return this.handle.getLongs().read(0);
    }

    /**
     * Sets the value of field 'salt'
     *
     * @param value New value for field 'salt'
     */
    public void setSalt(long value) {
        this.handle.getLongs().write(0, value);
    }

    /**
     * Retrieves the value of field 'argumentSignatures'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'argumentSignatures'
     */
    public InternalStructure getArgumentSignaturesInternal() {
        return this.handle.getStructures().read(3); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.ArgumentSignatures Generic type: class net.minecraft.commands.arguments.ArgumentSignatures
    }

    /**
     * Sets the value of field 'argumentSignatures'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'argumentSignatures'
     */
    public void setArgumentSignaturesInternal(InternalStructure value) {
        this.handle.getStructures().write(3, value); // TODO: No specific modifier has been found for type class net.minecraft.commands.arguments.ArgumentSignatures Generic type: class net.minecraft.commands.arguments.ArgumentSignatures
    }

    /**
     * Retrieves the value of field 'lastSeenMessages'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'lastSeenMessages'
     */
    public InternalStructure getLastSeenMessagesInternal() {
        return this.handle.getStructures().read(4); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.LastSeenMessages$Update Generic type: class net.minecraft.network.chat.LastSeenMessages$Update
    }

    /**
     * Sets the value of field 'lastSeenMessages'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'lastSeenMessages'
     */
    public void setLastSeenMessagesInternal(InternalStructure value) {
        this.handle.getStructures().write(4, value); // TODO: No specific modifier has been found for type class net.minecraft.network.chat.LastSeenMessages$Update Generic type: class net.minecraft.network.chat.LastSeenMessages$Update
    }

}
