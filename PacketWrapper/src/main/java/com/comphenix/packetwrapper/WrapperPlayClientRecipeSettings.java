package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;

public class WrapperPlayClientRecipeSettings extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.RECIPE_SETTINGS;

    public WrapperPlayClientRecipeSettings() {
        super(TYPE);
    }

    public WrapperPlayClientRecipeSettings(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.RecipeBookType getBookType() {
        return this.handle.getRecipeBookTypes().read(0);
    }

    public void setBookType(EnumWrappers.RecipeBookType value) {
        this.handle.getRecipeBookTypes().write(0, value);
    }

    public boolean getIsOpen() {
        return this.handle.getBooleans().read(0);
    }

    public void setIsOpen(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getIsFiltering() {
        return this.handle.getBooleans().read(1);
    }

    public void setIsFiltering(boolean value) {
        this.handle.getBooleans().write(1, value);
    }


}
