package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientRecipeSettings extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.RECIPE_SETTINGS;

    public WrapperPlayClientRecipeSettings() {
        super(TYPE);
    }

    public WrapperPlayClientRecipeSettings(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getBookType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.inventory.RecipeBookType
    }

    public void setBookType(Object value) {
        throw new UnsupportedOperationException();
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
