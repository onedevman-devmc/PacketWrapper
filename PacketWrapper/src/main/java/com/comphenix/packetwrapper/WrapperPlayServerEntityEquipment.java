package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerEntityEquipment extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.ENTITY_EQUIPMENT;

    public WrapperPlayServerEntityEquipment() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerEntityEquipment(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getEntity() {
        return this.handle.getIntegers().read(0);
    }

    public void setEntity(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public Object getSlots() {
// Generic field type: [com.mojang.datafixers.util.Pair<net.minecraft.world.entity.EquipmentSlot, net.minecraft.world.item.ItemStack>]//    return this.handle.getSlotStackPairLists().read(-1);
        throw new UnsupportedOperationException();
    }

    public void setSlots(Object value) {
        throw new UnsupportedOperationException();
    }


}
