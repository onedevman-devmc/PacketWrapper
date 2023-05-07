package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerStopSound extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.STOP_SOUND;

    public WrapperPlayServerStopSound() {
        super(TYPE);
    }

    public WrapperPlayServerStopSound(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'name'
     *
     * @return 'name'
     */
    public MinecraftKey getName() {
        return this.handle.getMinecraftKeys().read(0);
    }

    /**
     * Sets the value of field 'name'
     *
     * @param value New value for field 'name'
     */
    public void setName(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

    /**
     * Retrieves the value of field 'source'
     *
     * @return 'source'
     */
    public SoundCategory getSource() {
        return this.handle.getSoundCategories().read(0);
    }

    /**
     * Sets the value of field 'source'
     *
     * @param value New value for field 'source'
     */
    public void setSource(SoundCategory value) {
        this.handle.getSoundCategories().write(0, value);
    }

}
