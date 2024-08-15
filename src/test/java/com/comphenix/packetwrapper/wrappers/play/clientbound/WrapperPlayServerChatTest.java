package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.packetwrapper.util.Utils;
import com.comphenix.packetwrapper.wrappers.data.WrappedBoundChatType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import com.comphenix.protocol.wrappers.WrappedMessageSignature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.BitSet;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerChatTest {
    @Test
    public void test() {
        WrapperPlayServerChat dummy = new WrapperPlayServerChat();
        dummy.setChatType(new WrappedBoundChatType(0, WrappedChatComponent.fromText("Chat"), null));
        dummy.setFilterMask(new WrapperPlayServerChat.WrappedFilterMask(new BitSet(), WrapperPlayServerChat.WrappedFilterMask.FilterMaskType.PARTIALLY_FILTERED));
        dummy.setIndex(1);
        dummy.setSignature(new WrappedMessageSignature(new byte[256]));
        dummy.setUnsignedContent(WrappedChatComponent.fromText("test"));
        dummy.setSender(UUID.randomUUID());
    }

    @Test
    public void testBoundChat() {
        WrappedBoundChatType chatType = new WrappedBoundChatType();
        chatType.setChatType(2);
        chatType.setComponent(WrappedChatComponent.fromText("abc"));
        chatType.setTargetName(WrappedChatComponent.fromText("hello"));
        chatType = Utils.unwrapAndWarp(chatType, WrappedBoundChatType.CONVERTER);
        assertEquals(2, chatType.getChatType());
        assertEquals(WrappedChatComponent.fromText("abc"), chatType.getComponent());
        assertEquals(WrappedChatComponent.fromText("hello"), chatType.getTargetName());
        chatType.setTargetName(null);
        chatType = Utils.unwrapAndWarp(chatType, WrappedBoundChatType.CONVERTER);
        assertNull(chatType.getTargetName());

    }

    @Test
    public void testFilterMask() {
        WrapperPlayServerChat.WrappedFilterMask filterMask = new WrapperPlayServerChat.WrappedFilterMask();
        final BitSet bitSet = new BitSet();
        bitSet.set(1, true);
        bitSet.set(2, false);
        filterMask.setBitSet(bitSet);
        filterMask.setType(WrapperPlayServerChat.WrappedFilterMask.FilterMaskType.PARTIALLY_FILTERED);

        filterMask = Utils.unwrapAndWarp(filterMask, WrapperPlayServerChat.WrappedFilterMask.CONVERTER);

        assertFalse(filterMask.getBitSet().get(0));
        assertTrue(filterMask.getBitSet().get(1));
        assertFalse(filterMask.getBitSet().get(2));
        assertEquals(WrapperPlayServerChat.WrappedFilterMask.FilterMaskType.PARTIALLY_FILTERED, filterMask.getType());
    }
}