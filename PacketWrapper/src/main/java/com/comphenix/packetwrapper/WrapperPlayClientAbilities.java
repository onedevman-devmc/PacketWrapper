package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientAbilities extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ABILITIES;

    public WrapperPlayClientAbilities() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientAbilities(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean getIsFlying() {
        return this.handle.getBooleans().read(0);
    }

    public void setIsFlying(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
