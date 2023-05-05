package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.PlayerInfoData;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class WrapperPlayServerPlayerInfo extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_INFO;

    public WrapperPlayServerPlayerInfo() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerPlayerInfo(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Set<EnumWrappers.PlayerInfoAction> getActions() {
        return this.handle.getPlayerInfoActions().read(0);
    }

    public void setActions(Set<EnumWrappers.PlayerInfoAction> value) {
        this.handle.getPlayerInfoActions().write(0, value);
    }

    public List<PlayerInfoData> getEntries() {
        return this.handle.getPlayerInfoDataLists().read(0);
    }

    public void setEntries(List<PlayerInfoData> value) {
        this.handle.getPlayerInfoDataLists().write(0, value);
    }


}
