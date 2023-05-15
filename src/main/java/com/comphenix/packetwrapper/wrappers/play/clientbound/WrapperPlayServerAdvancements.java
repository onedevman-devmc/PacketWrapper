package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.Map;
import java.util.Set;

public class WrapperPlayServerAdvancements extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ADVANCEMENTS;

    public WrapperPlayServerAdvancements() {
        super(TYPE);
    }

    public WrapperPlayServerAdvancements(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'reset'
     *
     * @return 'reset'
     */
    public boolean getReset() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'reset'
     *
     * @param value New value for field 'reset'
     */
    public void setReset(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'added'
     *
     * @return 'added'
     */
    public Map<MinecraftKey, InternalStructure> getAdded() {
        return this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'added'
     *
     * @param value New value for field 'added'
     */
    public void setAdded(Map value) {
        this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).write(0, value);
    }

    /**
     * Retrieves the value of field 'removed'
     *
     * @return 'removed'
     */
    public Set<MinecraftKey> getRemoved() {
        return this.handle.getSets(MinecraftKey.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'removed'
     *
     * @param value New value for field 'removed'
     */
    public void setRemoved(Set<MinecraftKey> value) {
        this.handle.getSets(MinecraftKey.getConverter()).write(0, value);
    }

    /**
     * Retrieves the value of field 'progress'
     *
     * @return 'progress'
     */
    public Map<MinecraftKey, InternalStructure> getProgress() {
        return this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).read(1);
    }

    /**
     * Sets the value of field 'progress'
     *
     * @param value New value for field 'progress'
     */
    public void setProgress(Map<MinecraftKey, InternalStructure> value) {
        this.handle.getMaps(MinecraftKey.getConverter(), InternalStructure.getConverter()).write(1, value);
    }

}
