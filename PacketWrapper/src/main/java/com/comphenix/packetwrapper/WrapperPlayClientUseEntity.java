package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientUseEntity extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.USE_ENTITY;

    public WrapperPlayClientUseEntity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientUseEntity(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntityId() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntityId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getAction() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type interface net.minecraft.network.protocol.game.ServerboundInteractPacket$Action
    }

    public void setAction(Object value) {
        throw new UnsupportedOperationException();
    }

    public boolean getUsingSecondaryAction() {
        return this.handle.getBooleans().read(0);
    }

    public void setUsingSecondaryAction(boolean value) {
        this.handle.getBooleans().write(0, value);
    }


}
