package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.potion.PotionEffectType;

public class WrapperPlayServerEntityEffect extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_EFFECT;

    public WrapperPlayServerEntityEffect() {
        super(TYPE);
    }

    public WrapperPlayServerEntityEffect(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public PotionEffectType getEffect() {
        return this.handle.getEffectTypes().read(0);
    }

    public void setEffect(PotionEffectType value) {
        this.handle.getEffectTypes().write(0, value);
    }

    public byte getEffectAmplifier() {
        return this.handle.getBytes().read(0);
    }

    public void setEffectAmplifier(byte value) {
        this.handle.getBytes().write(0, value);
    }

    public int getEffectDurationTicks() {
        return this.handle.getIntegers().read(1);
    }

    public void setEffectDurationTicks(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public byte getFlags() {
        return this.handle.getBytes().read(1);
    }

    public void setFlags(byte value) {
        this.handle.getBytes().write(1, value);
    }

    public Object getFactorData() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.effect.MobEffectInstance$FactorData
    }

    public void setFactorData(Object value) {
        throw new UnsupportedOperationException();
    }


}
