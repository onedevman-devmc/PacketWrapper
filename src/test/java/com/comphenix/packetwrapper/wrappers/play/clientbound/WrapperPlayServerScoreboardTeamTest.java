package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.ChatColor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Lukas Alt
 * @since 18.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerScoreboardTeamTest {
    @Test
    public void test() {
        WrapperPlayServerScoreboardTeam dummy = new WrapperPlayServerScoreboardTeam();
        dummy.setParameters(null);
        assertFalse(dummy.getParameters().isPresent());
        dummy.setParameters(createDummyParams());
        assertEquals(createDummyParams(), dummy.getParameters().get());
    }

    private WrapperPlayServerScoreboardTeam.WrappedParameters createDummyParams() {
        return new WrapperPlayServerScoreboardTeam.WrappedParameters(WrappedChatComponent.fromText("a"), WrappedChatComponent.fromText("b"), WrappedChatComponent.fromText("c"),
                "d", "e", ChatColor.AQUA, 1337);
    }
}