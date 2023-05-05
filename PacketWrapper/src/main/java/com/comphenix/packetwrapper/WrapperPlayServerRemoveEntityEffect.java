package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.potion.PotionEffectType;

public class WrapperPlayServerRemoveEntityEffect extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.REMOVE_ENTITY_EFFECT;

    public WrapperPlayServerRemoveEntityEffect() {
        super(TYPE);
    }

    public WrapperPlayServerRemoveEntityEffect(PacketContainer packet) {
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


}
