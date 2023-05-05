package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerScoreboardObjective extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;

    public WrapperPlayServerScoreboardObjective() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardObjective(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getObjectiveName() {
        return this.handle.getStrings().read(0);
    }

    public void setObjectiveName(String value) {
        this.handle.getStrings().write(0, value);
    }

    public WrappedChatComponent getDisplayName() {
         return this.handle.getChatComponents().read(0);
    }

    public void setDisplayName(WrappedChatComponent value) {
        this.handle.getChatComponents().write(0, value);
    }

    public Object getRenderType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.scores.criteria.ObjectiveCriteria$RenderType
    }

    public void setRenderType(Object value) {
        throw new UnsupportedOperationException();
    }

    public int getMethod() {
        return this.handle.getIntegers().read(0);
    }

    public void setMethod(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
