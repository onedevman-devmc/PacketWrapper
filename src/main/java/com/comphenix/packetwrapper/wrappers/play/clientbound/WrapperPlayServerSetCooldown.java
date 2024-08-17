package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.packetwrapper.util.MoreConverters;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import org.bukkit.Material;

public class WrapperPlayServerSetCooldown extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_COOLDOWN;

    public WrapperPlayServerSetCooldown() {
        super(TYPE);
    }

    public WrapperPlayServerSetCooldown(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'item'
     *
     * @return 'item'
     */
    public Material getItem() {
        return this.handle.getModifier().withType(MinecraftReflection.getItemClass(), MoreConverters.getMaterialConverter()).read(0);
    }

    /**
     * Sets the value of field 'item'
     *
     * @param value New value for field 'item'
     */
    public void setItem(Material value) {
        this.handle.getModifier().withType(MinecraftReflection.getItemClass(), MoreConverters.getMaterialConverter()).write(0, value);
    }

    /**
     * Retrieves the value of field 'duration'
     *
     * @return 'duration'
     */
    public int getDuration() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'duration'
     *
     * @param value New value for field 'duration'
     */
    public void setDuration(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
