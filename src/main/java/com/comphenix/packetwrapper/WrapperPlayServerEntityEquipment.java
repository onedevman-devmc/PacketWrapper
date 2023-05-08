package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.List;

public class WrapperPlayServerEntityEquipment extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_EQUIPMENT;

    public WrapperPlayServerEntityEquipment() {
        super(TYPE);
    }

    public WrapperPlayServerEntityEquipment(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'entity'
     *
     * @return 'entity'
     */
    public int getEntity() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'entity'
     *
     * @param value New value for field 'entity'
     */
    public void setEntity(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'slots'
     *
     * @return 'slots'
     */
    public List<InternalStructure> getSlots() {
        return this.handle.getLists(InternalStructure.getConverter()).read(0); // TODO: No modifier has been found for type interface java.util.List Generic type: [com.mojang.datafixers.util.Pair<net.minecraft.world.entity.EquipmentSlot, net.minecraft.world.item.ItemStack>]
    }

    /**
     * Sets the value of field 'slots'
     *
     * @param value New value for field 'slots'
     */
    public void setSlots(List<InternalStructure> value) {
        this.handle.getLists(InternalStructure.getConverter()).write(0, value);
    }

}
