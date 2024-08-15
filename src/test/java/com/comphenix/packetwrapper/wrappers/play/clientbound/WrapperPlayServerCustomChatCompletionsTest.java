package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerCustomChatCompletionsTest {
    @Test
    public void test() {
        WrapperPlayServerCustomChatCompletions dummy = new WrapperPlayServerCustomChatCompletions();
        dummy.setAction(WrapperPlayServerCustomChatCompletions.Action.REMOVE);
        List<String> entries = List.of("a", "b", "c");
        dummy.setEntries(entries);
        assertEquals(WrapperPlayServerCustomChatCompletions.Action.REMOVE, dummy.getAction());
        assertEquals(entries, dummy.getEntries());
    }
}