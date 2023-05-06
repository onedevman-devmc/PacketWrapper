package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatVisibility;

public class WrapperPlayClientSettings extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.SETTINGS;

    public WrapperPlayClientSettings() {
        super(TYPE);
    }

    public WrapperPlayClientSettings(PacketContainer packet) {
        super(packet, TYPE);
    }

    public String getLanguage() {
        return this.handle.getStrings().read(0);
    }

    public void setLanguage(String value) {
        this.handle.getStrings().write(0, value);
    }

    public int getViewDistance() {
        return this.handle.getIntegers().read(0);
    }

    public void setViewDistance(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public ChatVisibility getChatVisibility() {
        return this.handle.getChatVisibilities().read(0);
    }

    public void setChatVisibility(ChatVisibility value) {
        this.handle.getChatVisibilities().write(0, value);
    }

    public boolean getChatColors() {
        return this.handle.getBooleans().read(0);
    }

    public void setChatColors(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public int getModelCustomisation() {
        return this.handle.getIntegers().read(1);
    }

    public void setModelCustomisation(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public EnumWrappers.HumanoidArm getMainHand() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.entity.HumanoidArm
    }

    public void setMainHand(EnumWrappers.HumanoidArm value) {
        throw new UnsupportedOperationException();
    }

    public boolean getTextFilteringEnabled() {
        return this.handle.getBooleans().read(1);
    }

    public void setTextFilteringEnabled(boolean value) {
        this.handle.getBooleans().write(1, value);
    }

    public boolean getAllowsListing() {
        return this.handle.getBooleans().read(2);
    }

    public void setAllowsListing(boolean value) {
        this.handle.getBooleans().write(2, value);
    }


}
