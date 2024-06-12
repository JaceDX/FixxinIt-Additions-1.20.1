package com.jacedx.fixxinitadditions.item;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.item.custom.FixxundriteLocatorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FixxinitAdditions.MOD_ID);

    public static final RegistryObject<Item> FIXXANDRITE_INGOT = ITEMS.register("fixxandrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIXXUNDRITE_INGOT = ITEMS.register("fixxundrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIXXALDRITE_INGOT = ITEMS.register("fixxaldrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIXXSTUDRITE_INGOT = ITEMS.register("fixxstudrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIXXNUNDRITE_INGOT = ITEMS.register("fixxnundrite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIXXUNMIUM_INGOT = ITEMS.register("fixxunmium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_FIXXANDRITE = ITEMS.register("raw_fixxandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FIXXUNDRITE = ITEMS.register("raw_fixxundrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FIXXALDRITE = ITEMS.register("raw_fixxaldrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FIXXSTUDRITE = ITEMS.register("raw_fixxstudrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FIXXNUNDRITE = ITEMS.register("raw_fixxnundrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FIXXUNMIUM = ITEMS.register("raw_fixxunmium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIXXUNDRITE_LOCATOR = ITEMS.register("fixxundrite_locator",
            () -> new FixxundriteLocatorItem(new Item.Properties().durability(1024)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
