package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BukkitConverters;
import org.bukkit.potion.PotionEffect;

import javax.annotation.Nullable;
import java.util.Optional;

public class WrapperPlayClientBeacon extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.BEACON;

    public WrapperPlayClientBeacon() {
        super(TYPE);
    }

    public WrapperPlayClientBeacon(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Optional<PotionEffect> getPrimary() {
        return this.handle.getOptionals(BukkitConverters.getPotionEffectConverter()).read(0);
    }

    public void setPrimary(@Nullable PotionEffect value) {
        this.handle.getOptionals(BukkitConverters.getPotionEffectConverter()).write(0, Optional.ofNullable(value));
    }

    public Optional<PotionEffect> getSecondary() {
        return this.handle.getOptionals(BukkitConverters.getPotionEffectConverter()).read(1);
    }

    public void setSecondary(@Nullable PotionEffect value) {
        this.handle.getOptionals(BukkitConverters.getPotionEffectConverter()).write(1, Optional.ofNullable(value));
    }


}
