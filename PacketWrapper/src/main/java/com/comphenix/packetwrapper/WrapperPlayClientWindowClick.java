package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.EquivalentConverter;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.BukkitConverters;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.units.qual.K;

import java.util.HashMap;
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
        return this.handle.getStructures().read(4); // TODO: No specific modifier has been found for type class net.minecraft.world.inventory.ClickType Generic type: class net.minecraft.world.inventory.ClickType
    }

    /**
     * Sets the value of field 'clickType'
     * ProtocolLib currently does not provide a wrapper for this type. Access to this type is only provided by an InternalStructure
     *
     * @param value New value for field 'clickType'
     */
    public void setClickType(InternalStructure value) {
        this.handle.getStructures().write(4, value); // TODO: No specific modifier has been found for type class net.minecraft.world.inventory.ClickType Generic type: class net.minecraft.world.inventory.ClickType
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
        return this.handle.getModifier().withType(Int2ObjectMap.class, getInt2ObjectMapConverter(BukkitConverters.getItemStackConverter())).read(0);
    }

    /**
     * Sets the value of field 'changedSlots'
     *
     * @param value New value for field 'changedSlots'
     */
    public void setChangedSlots(Int2ObjectMap<ItemStack> value) {
        this.handle.getModifier().withType(Int2ObjectMap.class, getInt2ObjectMapConverter(BukkitConverters.getItemStackConverter())).write(0, value);
    }

    public static <V> EquivalentConverter<Int2ObjectMap<V>> getInt2ObjectMapConverter(EquivalentConverter<V> valConverter) {
        return new EquivalentConverter<Int2ObjectMap<V>>() {
            @Override
            public Int2ObjectMap<V> getSpecific(Object generic) {
                Map<Object, Object> genericMap = (Map<Object, Object>) generic;
                Int2ObjectMap<V> newMap;

                try {
                    newMap = (Int2ObjectMap<V>) genericMap.getClass().newInstance();
                } catch (ReflectiveOperationException ex) {
                    newMap = new Int2ObjectOpenHashMap<>();
                }

                for (Map.Entry<Object, Object> entry : genericMap.entrySet()) {
                    newMap.put(((Integer) entry.getKey()).intValue(), valConverter.getSpecific(entry.getValue()));
                }

                return newMap;
            }

            @Override
            public Object getGeneric(Int2ObjectMap<V> specific) {
                Map<Object, Object> newMap;

                try {
                    newMap = specific.getClass().newInstance();
                } catch (ReflectiveOperationException ex) {
                    newMap = new HashMap<>();
                }

                for (Int2ObjectMap.Entry<V> entry : specific.int2ObjectEntrySet()) {
                    newMap.put(entry.getIntKey(), valConverter.getGeneric(entry.getValue()));
                }

                return newMap;
            }

            @Override
            public Class<Int2ObjectMap<V>> getSpecificType() {
                return null;
            }
        };
    }

}
