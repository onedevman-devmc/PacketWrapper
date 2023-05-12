package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatVisibility;

public class WrapperPlayClientSettings extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SETTINGS;
    private static final Class<?> HUMANOID_ARM_CLASS = MinecraftReflection.getNullableNMS("world.entity.HumanoidArm", "world.entity.EnumMainHand");

    public WrapperPlayClientSettings() {
        super(TYPE);
    }

    public WrapperPlayClientSettings(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'language'
     *
     * @return 'language'
     */
    public String getLanguage() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'language'
     *
     * @param value New value for field 'language'
     */
    public void setLanguage(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'viewDistance'
     *
     * @return 'viewDistance'
     */
    public int getViewDistance() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'viewDistance'
     *
     * @param value New value for field 'viewDistance'
     */
    public void setViewDistance(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'chatVisibility'
     *
     * @return 'chatVisibility'
     */
    public ChatVisibility getChatVisibility() {
        return this.handle.getChatVisibilities().read(0);
    }

    /**
     * Sets the value of field 'chatVisibility'
     *
     * @param value New value for field 'chatVisibility'
     */
    public void setChatVisibility(ChatVisibility value) {
        this.handle.getChatVisibilities().write(0, value);
    }

    /**
     * Retrieves the value of field 'chatColors'
     *
     * @return 'chatColors'
     */
    public boolean getChatColors() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'chatColors'
     *
     * @param value New value for field 'chatColors'
     */
    public void setChatColors(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    /**
     * Retrieves the value of field 'modelCustomisation'
     *
     * @return 'modelCustomisation'
     */
    public int getModelCustomisation() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'modelCustomisation'
     *
     * @param value New value for field 'modelCustomisation'
     */
    public void setModelCustomisation(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'mainHand'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'mainHand'
     */
    public HumanoidArm getMainHand() {
        return this.handle.getModifier().withType(HUMANOID_ARM_CLASS, new EnumWrappers.IndexedEnumConverter<>(HumanoidArm.class, HUMANOID_ARM_CLASS)).read(0);
    }

    /**
     * Sets the value of field 'mainHand'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'mainHand'
     */
    public void setMainHand(HumanoidArm value) {
        this.handle.getModifier().withType(HUMANOID_ARM_CLASS, new EnumWrappers.IndexedEnumConverter<>(HumanoidArm.class, HUMANOID_ARM_CLASS)).write(0, value);
    }

    /**
     * Retrieves the value of field 'textFilteringEnabled'
     *
     * @return 'textFilteringEnabled'
     */
    public boolean getTextFilteringEnabled() {
        return this.handle.getBooleans().read(1);
    }

    /**
     * Sets the value of field 'textFilteringEnabled'
     *
     * @param value New value for field 'textFilteringEnabled'
     */
    public void setTextFilteringEnabled(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    /**
     * Retrieves the value of field 'allowsListing'
     *
     * @return 'allowsListing'
     */
    public boolean getAllowsListing() {
        return this.handle.getBooleans().read(2);
    }

    /**
     * Sets the value of field 'allowsListing'
     *
     * @param value New value for field 'allowsListing'
     */
    public void setAllowsListing(boolean value) {
        this.handle.getBooleans().write(2, value);
    }

    public enum HumanoidArm {
        LEFT,
        RIGHT
    }

}
