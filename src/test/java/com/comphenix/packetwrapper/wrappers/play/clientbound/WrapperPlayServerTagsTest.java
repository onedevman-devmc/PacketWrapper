package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.wrappers.data.ResourceKey;
import com.comphenix.protocol.wrappers.MinecraftKey;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Collections;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Lukas Alt
 * @since 18.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerTagsTest {
    @Test
    public void test() {
        WrapperPlayServerTags dummy = new WrapperPlayServerTags();
        WrapperPlayServerTags.WrappedNetworkPayload payload = new WrapperPlayServerTags.WrappedNetworkPayload();
        final MinecraftKey key = new MinecraftKey("f", "d");
        final IntArrayList list = new IntArrayList(new int[]{ 1, 2, 3 });
        payload.setTags(Collections.singletonMap(
                key,
                list
        ));
        ResourceKey resourceKey = new ResourceKey(new MinecraftKey("a", "b"), new MinecraftKey("a", "c"));
        dummy.setTags(Collections.singletonMap(
                resourceKey,
                payload
        ));

        Map<ResourceKey, WrapperPlayServerTags.WrappedNetworkPayload> tags = dummy.getTags();
        WrapperPlayServerTags.WrappedNetworkPayload p = tags.get(resourceKey);
        assertNotNull(p);
        IntList list0 = p.getTags().get(key);
        assertNotNull(list);
        assertEquals(list, list0);
    }
}