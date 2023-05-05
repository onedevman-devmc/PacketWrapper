package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientAdvancements extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ADVANCEMENTS;

    public WrapperPlayClientAdvancements() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientAdvancements(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getAction() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket$Action
    }

    public void setAction(Object value) {
        throw new UnsupportedOperationException();
    }

    public MinecraftKey getTab() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setTab(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }


}
