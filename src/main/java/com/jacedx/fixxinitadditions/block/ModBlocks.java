package com.jacedx.fixxinitadditions.block;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.custom.FixxandriteOuterMachineHullBlock;
import com.jacedx.fixxinitadditions.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), UniformInt.of(7,10)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXNUNDRITE_ORE = registerBlock("deepslate_fixxnundrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), UniformInt.of(7,10)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXSTUDRITE_ORE = registerBlock("deepslate_fixxstudrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), UniformInt.of(7,10)));
    public static final RegistryObject<Block> DEEPSLATE_FIXXUNDRITE_ORE = registerBlock("deepslate_fixxundrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), UniformInt.of(7,10)));
    public static final RegistryObject<Block> NETHER_FIXXANDRITE_ORE = registerBlock("nether_fixxandrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL), UniformInt.of(10,15)));


    public static final RegistryObject<Block> FIXXANDRITE_OUTER_MACHINE_HULL = registerBlock("fixxandrite_outer_machine_hull",
            () -> new FixxandriteOuterMachineHullBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));


    public static final RegistryObject<Block> FIXXALDRITE_STAIRS = registerBlock("fixxaldrite_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXALDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXALDRITE_SLAB = registerBlock("fixxaldrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXANDRITE_STAIRS = registerBlock("fixxandrite_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXANDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXANDRITE_SLAB = registerBlock("fixxandrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXNUNDRITE_STAIRS = registerBlock("fixxnundrite_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXNUNDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXNUNDRITE_SLAB = registerBlock("fixxnundrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXSTUDRITE_STAIRS = registerBlock("fixxstudrite_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXSTUDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXSTUDRITE_SLAB = registerBlock("fixxstudrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXUNDRITE_STAIRS = registerBlock("fixxundrite_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXUNDRITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXUNDRITE_SLAB = registerBlock("fixxundrite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXUNMIUM_STAIRS = registerBlock("fixxunmium_stairs",
            () -> new StairBlock(() -> ModBlocks.FIXXUNMIUM_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> FIXXUNMIUM_SLAB = registerBlock("fixxunmium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FIXXALDRITE_PRESSURE_PLATE = registerBlock("fixxaldrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXALDRITE_BUTTON = registerBlock("fixxaldrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> FIXXANDRITE_PRESSURE_PLATE = registerBlock("fixxadrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXANDRITE_BUTTON = registerBlock("fixxandrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> FIXXNUNDRITE_PRESSURE_PLATE = registerBlock("fixxnundrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXNUNDRITE_BUTTON = registerBlock("fixxnundrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> FIXXSTUDRITE_PRESSURE_PLATE = registerBlock("fixxstudrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXSTUDRITE_BUTTON = registerBlock("fixxstudrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> FIXXUNDRITE_PRESSURE_PLATE = registerBlock("fixxundrite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXUNDRITE_BUTTON = registerBlock("fixxundrite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> FIXXUNMIUM_PRESSURE_PLATE = registerBlock("fixxunmium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.GRANITE_STAIRS).sound(SoundType.METAL), BlockSetType.IRON));
    public static final RegistryObject<Block> FIXXUNMIUM_BUTTON = registerBlock("fixxunmium_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 10, true));

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
