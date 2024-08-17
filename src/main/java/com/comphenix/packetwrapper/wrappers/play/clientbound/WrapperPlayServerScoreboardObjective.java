package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.scoreboard.RenderType;

public class WrapperPlayServerScoreboardObjective extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;
    private static final Class<?> ACTION_CLASS = MinecraftReflection.getNullableNMS("world.scores.criteria.ObjectiveCriteria$RenderType", "world.scores.criteria.IScoreboardCriteria$EnumScoreboardHealthDisplay");

    public WrapperPlayServerScoreboardObjective() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardObjective(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'objectiveName'
     *
     * @return 'objectiveName'
     */
    public String getObjectiveName() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'objectiveName'
     *
     * @param value New value for field 'objectiveName'
     */
    public void setObjectiveName(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'displayName'
     *
     * @return 'displayName'
     */
    public WrappedChatComponent getDisplayName() {
        return this.handle.getChatComponents().read(0);
    }

    /**
     * Sets the value of field 'displayName'
     *
     * @param value New value for field 'displayName'
     */
    public void setDisplayName(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    /**
     * Retrieves the render type for this objective
     *
     * @return 'renderType'
     */
    public RenderType getRenderType() {
        return this.handle.getModifier().withType(ACTION_CLASS, new EnumWrappers.IndexedEnumConverter<>(RenderType.class, ACTION_CLASS)).read(0);
    }

    /**
     * Sets the render type for this objective
     *
     * @param value New value for field 'renderType'
     */
    public void setRenderType(RenderType value) {
        this.handle.getModifier().withType(ACTION_CLASS, new EnumWrappers.IndexedEnumConverter<>(RenderType.class, ACTION_CLASS)).write(0, value);
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

}
