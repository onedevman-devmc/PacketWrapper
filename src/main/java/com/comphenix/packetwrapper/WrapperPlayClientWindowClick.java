package com.comphenix.packetwrapper;

import com.comphenix.packetwrapper.util.MoreConverters;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.EquivalentConverter;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.Converters;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class WrapperPlayClientWindowClick extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.WINDOW_CLICK;

    public WrapperPlayClientWindowClick() {
        super(TYPE);
    }

    public WrapperPlayClientWindowClick(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'containerId'
     *
     * @return 'containerId'
     */
    public int getContainerId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'containerId'
     *
     * @param value New value for field 'containerId'
     */
    public void setContainerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'stateId'
     *
     * @return 'stateId'
     */
    public int getStateId() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'stateId'
     *
     * @param value New value for field 'stateId'
     */
    public void setStateId(int value) {
        this.handle.getIntegers().write(1, value);
    }

    /**
     * Retrieves the value of field 'slotNum'
     *
     * @return 'slotNum'
     */
    public int getSlotNum() {
        return this.handle.getIntegers().read(2);
    }

    /**
     * Sets the value of field 'slotNum'
     *
     * @param value New value for field 'slotNum'
     */
    public void setSlotNum(int value) {
        this.handle.getIntegers().write(2, value);
    }

    /**
     * Retrieves the value of field 'buttonNum'
     *
     * @return 'buttonNum'
     */
    public int getButtonNum() {
        return this.handle.getIntegers().read(3);
    }

    /**
     * Sets the value of field 'buttonNum'
     *
     * @param value New value for field 'buttonNum'
     */
    public void setButtonNum(int value) {
        this.handle.getIntegers().write(3, value);
    }

    /**
     * Retrieves the value of field 'clickType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @return 'clickType'
     */
    public InternalStructure getClickType() {
        return this.handle.getStructures().read(0); // TODO: No specific modifier has been found for type class net.minecraft.world.inventory.ClickType Generic type: class net.minecraft.world.inventory.ClickType
    }

    /**
     * Sets the value of field 'clickType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'clickType'
     */
    public void setClickType(InternalStructure value) {
        this.handle.getStructures().write(0, value); // TODO: No specific modifier has been found for type class net.minecraft.world.inventory.ClickType Generic type: class net.minecraft.world.inventory.ClickType
    }

    /**
     * Retrieves the value of field 'carriedItem'
     *
     * @return 'carriedItem'
     */
    public ItemStack getCarriedItem() {
        return this.handle.getItemModifier().read(0);
    }

    /**
     * Sets the value of field 'carriedItem'
     *
     * @param value New value for field 'carriedItem'
     */
    public void setCarriedItem(ItemStack value) {
        this.handle.getItemModifier().write(0, value);
    }

    /**
     * Retrieves the value of field 'changedSlots'
     *
     * @return 'changedSlots'
     */
    public Int2ObjectMap<ItemStack> getChangedSlots() {
        return this.getInt2ObjectMaps(BukkitConverters.getItemStackConverter()).read(0);
    }

    /**
     * Sets the value of field 'changedSlots'
     *
     * @param value New value for field 'changedSlots'
     */
    public void setChangedSlots(Int2ObjectMap<ItemStack> value) {
        this.getInt2ObjectMaps(BukkitConverters.getItemStackConverter()).write(0, value);
    }

    private <T> StructureModifier<Int2ObjectMap<T>> getInt2ObjectMaps(EquivalentConverter<T> valueConverter) {
        return this.handle.getModifier().withType(Int2ObjectMap.class, MoreConverters.getInt2ObjectMapConverter(valueConverter));
    }

}
