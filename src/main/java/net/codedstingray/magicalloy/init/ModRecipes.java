package net.codedstingray.magicalloy.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        //Ores
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 3);
        GameRegistry.addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT), 3);

        //Dusts
        GameRegistry.addSmelting(ModItems.COPPER_DUST, new ItemStack(ModItems.COPPER_INGOT), 0);
        GameRegistry.addSmelting(ModItems.TIN_DUST, new ItemStack(ModItems.TIN_INGOT), 0);
        GameRegistry.addSmelting(ModItems.BRONZE_DUST, new ItemStack(ModItems.BRONZE_INGOT), 0);
    }
}
