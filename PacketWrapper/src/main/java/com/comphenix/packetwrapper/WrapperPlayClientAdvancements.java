package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientAdvancements extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.ADVANCEMENTS;

    public WrapperPlayClientAdvancements() {
        super(TYPE);
    }

    public WrapperPlayClientAdvancements(PacketContainer packet) {
        super(packet, TYPE);
    }

    public EnumWrappers.AdvancementAction getAction() {
        return this.handle.getAdvancementActions().read(0);
    }

    public void setAction(EnumWrappers.AdvancementAction value) {
        this.handle.getAdvancementActions().write(0, value);
    }


    public MinecraftKey getTab() {
        return this.handle.getMinecraftKeys().read(0);
    }

    public void setTab(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }


}
