package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedStatistic;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class WrapperPlayClientWindowClick extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.WINDOW_CLICK;

    public WrapperPlayClientWindowClick() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayClientWindowClick(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public int getStateId() {
        return this.handle.getIntegers().read(1);
    }

    public void setStateId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    public int getSlotNum() {
        return this.handle.getIntegers().read(2);
    }

    public void setSlotNum(int value) {
        this.handle.getIntegers().write(2, value);
    }

    public int getButtonNum() {
        return this.handle.getIntegers().read(3);
    }

    public void setButtonNum(int value) {
        this.handle.getIntegers().write(3, value);
    }

    public Object getClickType() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.world.inventory.ClickType
    }

    public void setClickType(Object value) {
        throw new UnsupportedOperationException();
    }

    public ItemStack getCarriedItem() {
        return this.handle.getItemModifier().read(0);
    }

    public void setCarriedItem(ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }

    public Map<WrappedStatistic, Integer> getChangedSlots() {
        return this.handle.getStatisticMaps().read(0);
    }

    public void setChangedSlots(Map<WrappedStatistic, Integer> value) {
        this.handle.getStatisticMaps().write(0, value);
    }


}
