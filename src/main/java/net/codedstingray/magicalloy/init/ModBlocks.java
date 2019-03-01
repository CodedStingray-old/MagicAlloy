package net.codedstingray.magicalloy.init;

import net.codedstingray.magicalloy.blocks.BlockAlloyFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

import java.util.LinkedList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new LinkedList<>();

    public static final Block COPPER_ORE = registerBlock(new Block(Material.ROCK), "copper_ore", CreativeTabs.BUILDING_BLOCKS);
    public static final Block COPPER_BLOCK = registerBlock(new Block(Material.IRON), "copper_block", CreativeTabs.BUILDING_BLOCKS);

    public static final Block TIN_ORE = registerBlock(new Block(Material.ROCK), "tin_ore", CreativeTabs.BUILDING_BLOCKS);
    public static final Block TIN_BLOCK = registerBlock(new Block(Material.IRON), "tin_block", CreativeTabs.BUILDING_BLOCKS);

    public static final Block BRONZE_BLOCK = registerBlock(new Block(Material.IRON), "bronze_block", CreativeTabs.BUILDING_BLOCKS);


    public static final Block ALLOY_FURNACE = registerBlock(new BlockAlloyFurnace(), "alloy_furnace", CreativeTabs.DECORATIONS);

    private static <B extends Block> B registerBlock(B block, String name, CreativeTabs creativeTab) {
        block.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(creativeTab);
        BLOCKS.add(block);
        ModItems.ITEMS.add(new ItemBlock(block).setUnlocalizedName(name).setRegistryName(name));

        return block;
    }
}
