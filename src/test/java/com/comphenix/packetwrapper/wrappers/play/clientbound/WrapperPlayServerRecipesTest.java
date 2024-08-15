package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.BaseTestInitialization;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Lukas Alt
 * @since 15.05.2023
 */
@ExtendWith(BaseTestInitialization.class)
class WrapperPlayServerRecipesTest {
    @Test
    public void test() {
        WrapperPlayServerRecipes dummy = new WrapperPlayServerRecipes();
        dummy.setState(WrapperPlayServerRecipes.Action.ADD);
        dummy.setRecipes(List.of(MinecraftKey.fromHandle(new MinecraftKey("a", "b"))));
        dummy.setToHighlight(List.of(MinecraftKey.fromHandle(new MinecraftKey("a", "b"))));
        WrapperPlayServerRecipes.WrappedRecipeBookSettings value = new WrapperPlayServerRecipes.WrappedRecipeBookSettings();
        for (WrapperPlayServerRecipes.RecipeBookType recipeBookType : WrapperPlayServerRecipes.RecipeBookType.values()) {
            value.getSettings(recipeBookType).setOpen(true);
            value.getSettings(recipeBookType).setFiltering(false);
        }
        dummy.setBookSettings(value);
        value = dummy.getBookSettings();
        for (WrapperPlayServerRecipes.RecipeBookType recipeBookType : WrapperPlayServerRecipes.RecipeBookType.values()) {
            assertTrue(value.getSettings(recipeBookType).isOpen());
            assertFalse(value.getSettings(recipeBookType).isFiltering());

        }
    }

}