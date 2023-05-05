package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;

import java.util.Optional;
import java.util.UUID;

public class WrapperLoginClientStart extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Client.START;

    public WrapperLoginClientStart() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperLoginClientStart(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getName() {
        return this.handle.getStrings().read(0);
    }

    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }

    public Optional<UUID> getProfileId() {
        return this.handle.getOptionals(Converters.passthrough(UUID.class)).read(0);
    }

    public void setProfileId(UUID value) {
        this.handle.getOptionals(Converters.passthrough(UUID.class)).write(0, Optional.ofNullable(value));
    }


}
