package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.Converters;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class WrapperPlayServerScoreboardTeam extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_TEAM;

    public WrapperPlayServerScoreboardTeam() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardTeam(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'method'
     *
     * @return 'method'
     */
    public int getMethod() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'method'
     *
     * @param value New value for field 'method'
     */
    public void setMethod(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'name'
     *
     * @return 'name'
     */
    public String getName() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'name'
     *
     * @param value New value for field 'name'
     */
    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'players'
     *
     * @return 'players'
     */
    public List<String> getPlayers() {
        return this.handle.getModifier().withType(Collection.class, BukkitConverters.getListConverter(Converters.passthrough(String.class))).read(0);
    }

    /**
     * Sets the value of field 'players'
     *
     * @param value New value for field 'players'
     */
    public void setPlayers(List<String> value) {
        this.handle.getModifier().withType(Collection.class, BukkitConverters.getListConverter(Converters.passthrough(String.class))).write(0, value);
    }

    /**
     * Retrieves the value of field 'parameters'
     *
     * @return 'parameters'
     */
    public Optional<InternalStructure> getParameters() {
        return this.handle.getOptionals(InternalStructure.getConverter() /* TODO: could not determine converter for net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket$Parameters */).read(0);
    }

    /**
     * Sets the value of field 'parameters'
     *
     * @param value New value for field 'parameters'
     */
    public void setParameters(@Nullable InternalStructure value) {
        this.handle.getOptionals(InternalStructure.getConverter() /* TODO: could not determine converter for net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket$Parameters */).write(0, Optional.ofNullable(value));
    }

}
