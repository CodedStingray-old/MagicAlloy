package net.codedstingray.magicalloy.init;

import net.codedstingray.magicalloy.items.util.ItemAxePC;
import net.codedstingray.magicalloy.items.util.ItemPickaxePC;
import net.codedstingray.magicalloy.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.LinkedList;
import java.util.List;

public class ModItems {

    //copper materials
    private static final Item.ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial(
            "material_copper", 1, 160, 3, 1, 4
    );
    private static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial(
            "armor_material_copper", Reference.ID + ":copper", 12, new int[] {1, 4, 4, 1},
            4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0
    );

    //bronze materials
    private static final Item.ToolMaterial MATERIAL_BRONZE = EnumHelper.addToolMaterial(
            "material_bronze", 2, 160, 3.5f, 2, 10
    );
    private static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_BRONZE = EnumHelper.addArmorMaterial(
            "armor_material_bronze", Reference.ID + ":bronze", 12, new int[] {2, 4, 5, 2},
            10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0
    );

    public static final List<Item> ITEMS = new LinkedList<>();

    //copper items
    public static final Item COPPER_INGOT =  registerItem(new Item(), "copper_ingot", CreativeTabs.MATERIALS);
    public static final Item COPPER_NUGGET = registerItem(new Item(), "copper_nugget", CreativeTabs.MATERIALS);
    public static final Item COPPER_DUST =   registerItem(new Item(), "copper_dust", CreativeTabs.MATERIALS);

    public static final Item COPPER_SWORD =   registerItem(new ItemSword(MATERIAL_COPPER), "copper_sword", CreativeTabs.COMBAT);
    public static final Item COPPER_PICKAXE = registerItem(new ItemPickaxePC(MATERIAL_COPPER), "copper_pickaxe", CreativeTabs.TOOLS);
    public static final Item COPPER_SHOVEL =  registerItem(new ItemSpade(MATERIAL_COPPER), "copper_shovel", CreativeTabs.TOOLS);
    public static final Item COPPER_AXE =     registerItem(new ItemAxePC(MATERIAL_COPPER, 6, -3.2f), "copper_axe", CreativeTabs.TOOLS);
    public static final Item COPPER_HOE =     registerItem(new ItemHoe(MATERIAL_COPPER), "copper_hoe", CreativeTabs.TOOLS);

    public static final Item COPPER_HELMET =     registerItem(new ItemArmor(ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD), "copper_helmet", CreativeTabs.COMBAT);
    public static final Item COPPER_CHESTPLATE = registerItem(new ItemArmor(ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST), "copper_chestplate", CreativeTabs.COMBAT);
    public static final Item COPPER_LEGGINS =    registerItem(new ItemArmor(ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS), "copper_leggins", CreativeTabs.COMBAT);
    public static final Item COPPER_BOOTS =      registerItem(new ItemArmor(ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET), "copper_boots", CreativeTabs.COMBAT);


    //tin items
    public static final Item TIN_INGOT =  registerItem(new Item(), "tin_ingot", CreativeTabs.MATERIALS);
    public static final Item TIN_NUGGET = registerItem(new Item(), "tin_nugget", CreativeTabs.MATERIALS);
    public static final Item TIN_DUST =   registerItem(new Item(), "tin_dust", CreativeTabs.MATERIALS);

    //bronze items
    public static final Item BRONZE_INGOT =  registerItem(new Item(), "bronze_ingot", CreativeTabs.MATERIALS);
    public static final Item BRONZE_NUGGET = registerItem(new Item(), "bronze_nugget", CreativeTabs.MATERIALS);
    public static final Item BRONZE_DUST =   registerItem(new Item(), "bronze_dust", CreativeTabs.MATERIALS);

    public static final Item BRONZE_SWORD =   registerItem(new ItemSword(MATERIAL_BRONZE), "bronze_sword", CreativeTabs.COMBAT);
    public static final Item BRONZE_PICKAXE = registerItem(new ItemPickaxePC(MATERIAL_BRONZE), "bronze_pickaxe", CreativeTabs.TOOLS);
    public static final Item BRONZE_SHOVEL =  registerItem(new ItemSpade(MATERIAL_BRONZE), "bronze_shovel", CreativeTabs.TOOLS);
    public static final Item BRONZE_AXE =     registerItem(new ItemAxePC(MATERIAL_BRONZE, 6, -3.2f), "bronze_axe", CreativeTabs.TOOLS);
    public static final Item BRONZE_HOE =     registerItem(new ItemHoe(MATERIAL_BRONZE), "bronze_hoe", CreativeTabs.TOOLS);

    public static final Item BRONZE_HELMET =     registerItem(new ItemArmor(ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.HEAD), "bronze_helmet", CreativeTabs.COMBAT);
    public static final Item BRONZE_CHESTPLATE = registerItem(new ItemArmor(ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.CHEST), "bronze_chestplate", CreativeTabs.COMBAT);
    public static final Item BRONZE_LEGGINS =    registerItem(new ItemArmor(ARMOR_MATERIAL_BRONZE, 2, EntityEquipmentSlot.LEGS), "bronze_leggins", CreativeTabs.COMBAT);
    public static final Item BRONZE_BOOTS =      registerItem(new ItemArmor(ARMOR_MATERIAL_BRONZE, 1, EntityEquipmentSlot.FEET), "bronze_boots", CreativeTabs.COMBAT);

    private static <I extends Item> I registerItem(I item, String name, CreativeTabs creativeTab) {
        item.setUnlocalizedName(name).setRegistryName(name).setCreativeTab(creativeTab);
        ITEMS.add(item);

        return item;
    }
}
