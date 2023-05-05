package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerSelectAdvancementTab extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SELECT_ADVANCEMENT_TAB;

    public WrapperPlayServerSelectAdvancementTab() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerSelectAdvancementTab(PacketContainer packet) {
        super(packet, TYPE);
    }

    public MinecraftKey getTab() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setTab(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }


}
