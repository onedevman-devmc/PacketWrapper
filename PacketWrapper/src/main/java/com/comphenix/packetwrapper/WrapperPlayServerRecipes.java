package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.List;

public class WrapperPlayServerRecipes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RECIPES;

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
    public EnumWrappers.RecipeUpdateState getState() {
        return this.handle.getRecipeUpdateStates().read(0);
    }

    /**
     * Sets the value of field 'state'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'state'
     */
    public void setState(EnumWrappers.RecipeUpdateState value) {
        this.handle.getRecipeUpdateStates().write(0, value);
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
    public InternalStructure getBookSettings() {
        return this.handle.getStructures().read(3); // TODO: No specific modifier has been found for type class net.minecraft.stats.RecipeBookSettings Generic type: class net.minecraft.stats.RecipeBookSettings
    }

    /**
     * Sets the value of field 'bookSettings'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'bookSettings'
     */
    public void setBookSettings(InternalStructure value) {
        this.handle.getStructures().write(3, value); // TODO: No specific modifier has been found for type class net.minecraft.stats.RecipeBookSettings Generic type: class net.minecraft.stats.RecipeBookSettings
    }

}
