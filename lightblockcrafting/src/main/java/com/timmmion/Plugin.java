package com.timmmion;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ItemStack;

public final class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("LightBlockCrafting enabled!");
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this,"custom_light_block"), new ItemStack(Material.LIGHT));

        recipe.shape(
                "SSS",
                "STS",
                "SSS");
        recipe.setIngredient('T',Material.TORCH);
        recipe.setIngredient('S',Material.GLASS_PANE);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
