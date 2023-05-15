package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.List;

public class WrapperPlayServerRecipes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RECIPES;
    private static final Class<?> ACTION_TYPE = MinecraftReflection.getNullableNMS("network.protocol.game.PacketPlayOutRecipes$Action");

    public WrapperPlayServerRecipes() {
        super(TYPE);
    }

    public WrapperPlayServerRecipes(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'state'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'state'
     */
    public Action getState() {
        return this.handle.getModifier().withType(ACTION_TYPE, new EnumWrappers.IndexedEnumConverter<>(Action.class, ACTION_TYPE)).read(0);
    }

    /**
     * Sets the value of field 'state'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'state'
     */
    public void setState(Action value) {
        this.handle.getModifier().withType(ACTION_TYPE, new EnumWrappers.IndexedEnumConverter<>(Action.class, ACTION_TYPE)).write(0, value);
    }

    /**
     * Retrieves the value of field 'recipes'
     *
     * @return 'recipes'
     */
    public List<MinecraftKey> getRecipes() {
        return this.handle.getLists(MinecraftKey.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'recipes'
     *
     * @param value New value for field 'recipes'
     */
    public void setRecipes(List<MinecraftKey> value) {
        this.handle.getLists(MinecraftKey.getConverter()).write(0, value);
    }

    /**
     * Retrieves the value of field 'toHighlight'
     *
     * @return 'toHighlight'
     */
    public List<MinecraftKey> getToHighlight() {
        return this.handle.getLists(MinecraftKey.getConverter()).read(1);
    }

    /**
     * Sets the value of field 'toHighlight'
     *
     * @param value New value for field 'toHighlight'
     */
    public void setToHighlight(List<MinecraftKey> value) {
        this.handle.getLists(MinecraftKey.getConverter()).write(1, value);
    }

    /**
     * Retrieves the value of field 'bookSettings'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'bookSettings'
     */
    public InternalStructure getBookSettingsInternal() {
        return this.handle.getStructures().read(3); // TODO: No specific modifier has been found for type class net.minecraft.stats.RecipeBookSettings Generic type: class net.minecraft.stats.RecipeBookSettings
    }

    /**
     * Sets the value of field 'bookSettings'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'bookSettings'
     */
    public void setBookSettingsInternal(InternalStructure value) {
        this.handle.getStructures().write(3, value); // TODO: No specific modifier has been found for type class net.minecraft.stats.RecipeBookSettings Generic type: class net.minecraft.stats.RecipeBookSettings
    }

    public enum Action {
        INIT,
        ADD,
        REMOVE;
    }

}
