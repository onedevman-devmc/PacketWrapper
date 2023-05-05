package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerStopSound extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.STOP_SOUND;

    public WrapperPlayServerStopSound() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerStopSound(PacketContainer packet) {
        super(packet, TYPE);
    }

    public MinecraftKey getName() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setName(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    public SoundCategory getSource() {
        return this.handle.getSoundCategories().read(0);
    }

    public void setSource(SoundCategory value) {
        this.handle.getSoundCategories().write(0, value);
    }


}
