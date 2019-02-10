package net.codedstingray.magicalloy.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.LinkedList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new LinkedList<>();

    public static final Item COPPER_INGOT = registerItem(new Item(), "copper_ingot", CreativeTabs.MATERIALS);


    public static <I extends Item> I registerItem(I item, String name, CreativeTabs creativeTab) {
        item.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(creativeTab);
        ITEMS.add(item);

        return item;
    }
}
