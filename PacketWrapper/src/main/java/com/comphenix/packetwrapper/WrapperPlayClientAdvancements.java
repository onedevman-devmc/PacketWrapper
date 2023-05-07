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

    /**
     * Retrieves the value of field 'action'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'action'
     */
    public EnumWrappers.AdvancementAction getAction() {
        return this.handle.getAdvancementActions().read(0);
    }

    /**
     * Sets the value of field 'action'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'action'
     */
    public void setAction(EnumWrappers.AdvancementAction value) {
        this.handle.getAdvancementActions().write(0, value);
    }

    /**
     * Retrieves the value of field 'tab'
     *
     * @return 'tab'
     */
    public MinecraftKey getTab() {
        return this.handle.getMinecraftKeys().read(0);
    }

    /**
     * Sets the value of field 'tab'
     *
     * @param value New value for field 'tab'
     */
    public void setTab(MinecraftKey value) {
        this.handle.getMinecraftKeys().write(0, value);
    }

}
