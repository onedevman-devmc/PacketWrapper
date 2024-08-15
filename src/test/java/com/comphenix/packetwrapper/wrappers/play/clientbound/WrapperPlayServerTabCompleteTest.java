package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Lukas Alt
 * @since 17.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerTabCompleteTest {
    @Test
    public void test() {
        WrapperPlayServerTabComplete.WrappedSuggestions suggestions = new WrapperPlayServerTabComplete.WrappedSuggestions();
        suggestions.setRange(new WrapperPlayServerTabComplete.WrappedStringRange(0, 1));
        suggestions.setSuggestions(List.of(
                new WrapperPlayServerTabComplete.WrappedSuggestion(new WrapperPlayServerTabComplete.WrappedStringRange(1, 2), "test1", new WrapperPlayServerTabComplete.WrappedLiteralMessage("Test 1")),
                new WrapperPlayServerTabComplete.WrappedSuggestion(new WrapperPlayServerTabComplete.WrappedStringRange(1, 2), "test2", new WrapperPlayServerTabComplete.WrappedLiteralMessage("Test 2")),
                new WrapperPlayServerTabComplete.WrappedSuggestion(new WrapperPlayServerTabComplete.WrappedStringRange(1, 2), "test3", new WrapperPlayServerTabComplete.WrappedComponentMessage(WrappedChatComponent.fromText("Test 3"))))
        );

        WrapperPlayServerTabComplete dummy = new WrapperPlayServerTabComplete();
        dummy.setId(1337);
        dummy.setSuggestions(suggestions);

        assertEquals(1337, dummy.getId());
        assertEquals(suggestions, dummy.getSuggestions());
    }

    @Test
    public void testMessages() {
        WrapperPlayServerTabComplete.WrappedLiteralMessage literal = new WrapperPlayServerTabComplete.WrappedLiteralMessage("test");
        assertEquals("test", literal.getString());
        literal.setString("hello");
        assertEquals("hello", literal.getString());


        WrapperPlayServerTabComplete.WrappedComponentMessage componentMessage = new WrapperPlayServerTabComplete.WrappedComponentMessage(WrappedChatComponent.fromText("This is a text"));
        assertEquals("This is a text", componentMessage.getString());
        componentMessage.setComponent(WrappedChatComponent.fromText("This is another text"));
        assertEquals("This is another text", componentMessage.getString());

    }
}