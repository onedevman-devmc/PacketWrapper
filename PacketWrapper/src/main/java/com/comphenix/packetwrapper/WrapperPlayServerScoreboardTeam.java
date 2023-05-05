package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;

import java.util.List;

public class WrapperPlayServerScoreboardTeam extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_TEAM;

    public WrapperPlayServerScoreboardTeam() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerScoreboardTeam(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getMethod() {
        return this.handle.getIntegers().read(0);
    }

    public void setMethod(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public String getName() {
        return this.handle.getStrings().read(0);
    }

    public void setName(String value) {
        this.handle.getStrings().write(0, value);
    }

    public List<String> getPlayers() {
        return this.handle.getLists(Converters.passthrough(String.class)).read(0);
    }

    public void setPlayers(List<String> value) {
        this.handle.getLists(Converters.passthrough(String.class)).write(0, value);
    }

    public Object getParameters() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class java.util.Optional
    }

    public void setParameters(Object value) {
        throw new UnsupportedOperationException();
    }


}
