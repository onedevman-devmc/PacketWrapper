package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.play.serverbound.WrapperPlayClientWindowClick;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author Lukas Alt
 * @since 08.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayClientWindowClickTest {

    @Test
    public void testChangedSlots() {
        WrapperPlayClientWindowClick packet = new WrapperPlayClientWindowClick();
        Int2ObjectMap<ItemStack> map = packet.getChangedSlots();
        map.put(1, new ItemStack(Material.AIR));
        map.put(3, new ItemStack(Material.STONE));
        packet.setChangedSlots(map);

    }
}