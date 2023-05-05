package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerOpenWindowMerchant extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.OPEN_WINDOW_MERCHANT;

    public WrapperPlayServerOpenWindowMerchant() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerOpenWindowMerchant(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getOffers() {
        // Generic field type: class net.minecraft.world.item.trading.MerchantOffers
        throw new UnsupportedOperationException();
    }

    public void setOffers(Object value) {
        throw new UnsupportedOperationException();
    }

    public int getVillagerLevel() {
        return this.handle.getIntegers().read(1);
    }

    public void setVillagerLevel(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getVillagerXp() {
        return this.handle.getIntegers().read(2);
    }

    public void setVillagerXp(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public boolean getShowProgress() {
        return this.handle.getBooleans().read(0);
    }

    public void setShowProgress(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

    public boolean getCanRestock() {
        return this.handle.getBooleans().read(1);
    }

    public void setCanRestock(boolean value) {
        this.handle.getBooleans().write(1, value);
    }


}
