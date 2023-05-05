package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import org.bukkit.Sound;

public class WrapperPlayServerEntitySound extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_SOUND;

    public WrapperPlayServerEntitySound() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerEntitySound(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Sound getSound() {
        return this.handle.getHolders(Sound.class, BukkitConverters.getSoundConverter()).read(0);
    }

    public void setSound(Sound value) {
        this.handle.getHolders(Sound.class, BukkitConverters.getSoundConverter()).write(0, value);
    }

    public SoundCategory getSource() {
        return this.handle.getSoundCategories().read(0);
    }

    public void setSource(SoundCategory value) {
        this.handle.getSoundCategories().write(0, value);
    }

    public int getId() {
        return this.handle.getIntegers().read(0);
    }

    public void setId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public float getVolume() {
        return this.handle.getFloat().read(0);
    }

    public void setVolume(float value) {
        this.handle.getFloat().write(0, value);
    }

    public float getPitch() {
        return this.handle.getFloat().read(1);
    }

    public void setPitch(float value) {
        this.handle.getFloat().write(1, value);
    }

    public long getSeed() {
        return this.handle.getLongs().read(0);
    }

    public void setSeed(long value) {
        this.handle.getLongs().write(0, value);
    }


}
