package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
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

    /**
     * Retrieves the value of field 'entityId'
     *
     * @return 'entityId'
     */
    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entityId'
     *
     * @param value New value for field 'entityId'
     */
    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'effect'
     *
     * @return 'effect'
     */
    public PotionEffectType getEffect() {
        return this.handle.getEffectTypes().read(0);
    }

    /**
     * Sets the value of field 'effect'
     *
     * @param value New value for field 'effect'
     */
    public void setEffect(PotionEffectType value) {
        this.handle.getEffectTypes().write(0, value);
    }

    /**
     * Retrieves the value of field 'effectAmplifier'
     *
     * @return 'effectAmplifier'
     */
    public byte getEffectAmplifier() {
        return this.handle.getBytes().read(0);
    }

    /**
     * Sets the value of field 'effectAmplifier'
     *
     * @param value New value for field 'effectAmplifier'
     */
    public void setEffectAmplifier(byte value) {
        this.handle.getBytes().write(0, value);
    }

    /**
     * Retrieves the value of field 'effectDurationTicks'
     *
     * @return 'effectDurationTicks'
     */
    public int getEffectDurationTicks() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'effectDurationTicks'
     *
     * @param value New value for field 'effectDurationTicks'
     */
    public void setEffectDurationTicks(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'flags'
     *
     * @return 'flags'
     */
    public byte getFlags() {
        return this.handle.getBytes().read(1);
    }

    /**
     * Sets the value of field 'flags'
     *
     * @param value New value for field 'flags'
     */
    public void setFlags(byte value) {
        this.handle.getBytes().write(1, value);
    }

    /**
     * Retrieves the value of field 'factorData'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'factorData'
     */
    public InternalStructure getFactorData() {
        return this.handle.getStructures().read(1); // TODO: No specific modifier has been found for type class net.minecraft.world.effect.MobEffectInstance$FactorData Generic type: class net.minecraft.world.effect.MobEffectInstance$FactorData
    }

    /**
     * Sets the value of field 'factorData'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'factorData'
     */
    public void setFactorData(InternalStructure value) {
        this.handle.getStructures().write(1, value); // TODO: No specific modifier has been found for type class net.minecraft.world.effect.MobEffectInstance$FactorData Generic type: class net.minecraft.world.effect.MobEffectInstance$FactorData
    }

}
