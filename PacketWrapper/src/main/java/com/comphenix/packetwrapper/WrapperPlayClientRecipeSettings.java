package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.RecipeBookType;

public class WrapperPlayClientRecipeSettings extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.RECIPE_SETTINGS;

    public WrapperPlayClientRecipeSettings() {
        super(TYPE);
    }

    public WrapperPlayClientRecipeSettings(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'bookType'
     *
     * @return 'bookType'
     */
    public RecipeBookType getBookType() {
        return this.handle.getRecipeBookTypes().read(0);
    }

    /**
     * Sets the value of field 'bookType'
     *
     * @param value New value for field 'bookType'
     */
    public void setBookType(RecipeBookType value) {
        this.handle.getRecipeBookTypes().write(0, value);
    }

    /**
     * Retrieves the value of field 'isOpen'
     *
     * @return 'isOpen'
     */
    public boolean getIsOpen() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'isOpen'
     *
     * @param value New value for field 'isOpen'
     */
    public void setIsOpen(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'isFiltering'
     *
     * @return 'isFiltering'
     */
    public boolean getIsFiltering() {
        return this.handle.getBooleans().read(1);
    }

    /**
     * Sets the value of field 'isFiltering'
     *
     * @param value New value for field 'isFiltering'
     */
    public void setIsFiltering(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

}
