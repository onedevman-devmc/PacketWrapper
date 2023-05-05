package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

import javax.annotation.Nullable;
import java.util.Optional;

public class WrapperPlayServerServerData extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SERVER_DATA;

    public WrapperPlayServerServerData() {
        super(TYPE);
    }

    public WrapperPlayServerServerData(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedChatComponent getMotd() {
        return this.handle.getChatComponents().read(0);
    }

    public void setMotd(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    public Optional<byte[]> getIconBytes() {
        return this.handle.getOptionals(Converters.passthrough(byte[].class)).read(0);
    }

    public void setIconBytes(@Nullable byte[] value) {
        this.handle.getOptionals(Converters.passthrough(byte[].class)).write(0, Optional.ofNullable(value));
    }

    public boolean getEnforcesSecureChat() {
        return this.handle.getBooleans().read(0);
    }

    public void setEnforcesSecureChat(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
