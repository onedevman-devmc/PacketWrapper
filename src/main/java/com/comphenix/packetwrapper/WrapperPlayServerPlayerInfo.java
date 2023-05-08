package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.PlayerInfoData;

import java.util.List;
import java.util.Set;

public class WrapperPlayServerPlayerInfo extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_INFO;

    public WrapperPlayServerPlayerInfo() {
        super(TYPE);
    }

    public WrapperPlayServerPlayerInfo(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'actions'
     *
     * @return 'actions'
     */
    public Set<EnumWrappers.PlayerInfoAction> getActions() {
        return this.handle.getPlayerInfoActions().read(0);
    }

    /**
     * Sets the value of field 'actions'
     *
     * @param value New value for field 'actions'
     */
    public void setActions(Set<EnumWrappers.PlayerInfoAction> value) {
        if (value.contains(EnumWrappers.PlayerInfoAction.REMOVE_PLAYER)) {
            throw new IllegalArgumentException("PlayerInfoAction.REMOVE_PLAYER has been removed. Use PacketType.Play.Server.PLAYER_INFO_REMOVE to remove Player Infos.");
        }
        this.handle.getPlayerInfoActions().write(0, value);
    }

    /**
     * Retrieves the value of field 'entries'
     *
     * @return 'entries'
     */
    public List<PlayerInfoData> getEntries() {
        return this.handle.getPlayerInfoDataLists().read(1);
    }

    /**
     * Sets the value of field 'entries'
     *
     * @param value New value for field 'entries'
     */
    public void setEntries(List<PlayerInfoData> value) {
        this.handle.getPlayerInfoDataLists().write(1, value);
    }

}
