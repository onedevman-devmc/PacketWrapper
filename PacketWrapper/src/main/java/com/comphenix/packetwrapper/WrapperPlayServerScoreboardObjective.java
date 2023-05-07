package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerScoreboardObjective extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;

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
     * Retrieves the value of field 'renderType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'renderType'
     */
    public EnumWrappers.ObjectiveRenderType getRenderType() {
        return this.handle.getObjectiveRenderTypes().read(0);
    }

    /**
     * Sets the value of field 'renderType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'renderType'
     */
    public void setRenderType(EnumWrappers.ObjectiveRenderType value) {
        this.handle.getObjectiveRenderTypes().write(2, value);
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
