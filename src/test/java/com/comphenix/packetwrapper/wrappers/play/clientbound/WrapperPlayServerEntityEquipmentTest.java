package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.Pair;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Lukas Alt
 * @since 15.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerEntityEquipmentTest {
    @Test
    public void test() {
        WrapperPlayServerEntityEquipment dummy = new WrapperPlayServerEntityEquipment();
        dummy.setEntity(1337);
        dummy.setSlots(List.of(
                new Pair<>(EnumWrappers.ItemSlot.LEGS, new ItemStack(Material.DIAMOND_BOOTS)),
                new Pair<>(EnumWrappers.ItemSlot.CHEST, new ItemStack(Material.CHAINMAIL_CHESTPLATE)),
                new Pair<>(EnumWrappers.ItemSlot.OFFHAND, new ItemStack(Material.MAP))
        ));
        List<Pair<EnumWrappers.ItemSlot, ItemStack>> list = dummy.getSlots();
        assertEquals(3, list.size());
        for (Pair<EnumWrappers.ItemSlot, ItemStack> itemSlotItemStackPair : list) {
            assertTrue(itemSlotItemStackPair.getFirst() == EnumWrappers.ItemSlot.LEGS || itemSlotItemStackPair.getFirst() == EnumWrappers.ItemSlot.CHEST || itemSlotItemStackPair.getFirst() == EnumWrappers.ItemSlot.OFFHAND);
        }
    }
}