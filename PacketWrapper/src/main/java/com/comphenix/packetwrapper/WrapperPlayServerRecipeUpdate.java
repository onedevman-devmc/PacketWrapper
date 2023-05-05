package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerRecipeUpdate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RECIPE_UPDATE;

    public WrapperPlayServerRecipeUpdate() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerRecipeUpdate(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getRecipes() {
        // TODO: Multiple candidates found for raw type + interface java.util.List here:
        // Generic field type: [net.minecraft.world.item.crafting.Recipe<?>]
        throw new UnsupportedOperationException();
    }

    public void setRecipes(Object value) {
        throw new UnsupportedOperationException();
    }


}
