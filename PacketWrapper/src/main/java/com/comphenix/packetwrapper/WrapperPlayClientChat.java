package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedMessageSignature;

import java.time.Instant;

public class WrapperPlayClientChat extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CHAT;

    public WrapperPlayClientChat() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientChat(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getMessage() {
        return this.handle.getStrings().read(0);
    }

    public void setMessage(String value) {
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

    public WrappedMessageSignature getSignature() {
        return this.handle.getMessageSignatures().read(0);
    }

    public void setSignature(WrappedMessageSignature value) {
        this.handle.getMessageSignatures().write(0, value);
    }

    public Object getLastSeenMessages() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.chat.LastSeenMessages$Update
    }

    public void setLastSeenMessages(Object value) {
        throw new UnsupportedOperationException();
    }


}
