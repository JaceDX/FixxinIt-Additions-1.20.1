package com.jacedx.fixxinitadditions.block;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FixxinitAdditions.MOD_ID);

    public static final RegistryObject<Block> FIXXALDRITE_BLOCK = registerBlock("fixxaldrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXANDRITE_BLOCK = registerBlock("fixxandrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXNUNDRITE_BLOCK = registerBlock("fixxnundrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXSTUDRITE_BLOCK = registerBlock("fixxstudrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        public static final RegistryObject<Block> FIXXUNDRITE_BLOCK = registerBlock("fixxundrite_block",
                () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                        .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXUNMIUM_BLOCK = registerBlock("fixxunmium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RAW_FIXXALDRITE_BLOCK = registerBlock("raw_fixxaldrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIXXANDRITE_BLOCK = registerBlock("raw_fixxandrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIXXNUNDRITE_BLOCK = registerBlock("raw_fixxnundrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIXXSTUDRITE_BLOCK = registerBlock("raw_fixxstudrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIXXUNDRITE_BLOCK = registerBlock("raw_fixxundrite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_FIXXUNMIUM_BLOCK = registerBlock("raw_fixxunmium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> DEEPSLATE_FIXXALDRITE_ORE = registerBlock("deepslate_fixxaldrite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXNUNDRITE_ORE = registerBlock("deepslate_fixxnundrite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXSTUDRITE_ORE = registerBlock("deepslate_fixxstudrite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXUNDRITE_ORE = registerBlock("deepslate_fixxundrite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NETHER_FIXXANDRITE_ORE = registerBlock("nether_fixxandrite_ore",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
