package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.List;

public class WrapperPlayServerRecipeUpdate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RECIPE_UPDATE;

    public WrapperPlayServerRecipeUpdate() {
        super(TYPE);
    }

    public WrapperPlayServerRecipeUpdate(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'recipes'
     *
     * @return 'recipes'
     */
    public List<InternalStructure> getRecipes() {
        return this.handle.getLists(InternalStructure.getConverter()).read(0);
    }

    /**
     * Sets the value of field 'recipes'
     *
     * @param value New value for field 'recipes'
     */
    public void setRecipes(List<InternalStructure> value) {
        this.handle.getLists(InternalStructure.getConverter()).write(0, value);
    }

}
