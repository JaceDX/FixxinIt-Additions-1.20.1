package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FixxinitAdditions.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FIXXALDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXALDRITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FIXXALDRITE_ORE);

        blockWithItem(ModBlocks.FIXXANDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXANDRITE_BLOCK);
        blockWithItem(ModBlocks.NETHER_FIXXANDRITE_ORE);

        blockWithItem(ModBlocks.FIXXNUNDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXNUNDRITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FIXXNUNDRITE_ORE);

        blockWithItem(ModBlocks.FIXXSTUDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXSTUDRITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FIXXSTUDRITE_ORE);

        blockWithItem(ModBlocks.FIXXUNDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXUNDRITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FIXXUNDRITE_ORE);

        blockWithItem(ModBlocks.FIXXUNMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_FIXXUNMIUM_BLOCK);


        horizontalBlock(ModBlocks.FIXXANDRITE_OUTER_MACHINE_HULL.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/fixxandrite_outer_machine_hull")));

        stairsBlock((StairBlock) ModBlocks.FIXXALDRITE_STAIRS.get(), blockTexture(ModBlocks.FIXXALDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXALDRITE_SLAB.get()), blockTexture(ModBlocks.FIXXALDRITE_BLOCK.get()), blockTexture(ModBlocks.FIXXALDRITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.FIXXANDRITE_STAIRS.get(), blockTexture(ModBlocks.FIXXANDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXANDRITE_SLAB.get()), blockTexture(ModBlocks.FIXXANDRITE_BLOCK.get()), blockTexture(ModBlocks.FIXXANDRITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.FIXXNUNDRITE_STAIRS.get(), blockTexture(ModBlocks.FIXXNUNDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXNUNDRITE_SLAB.get()), blockTexture(ModBlocks.FIXXNUNDRITE_BLOCK.get()), blockTexture(ModBlocks.FIXXNUNDRITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.FIXXSTUDRITE_STAIRS.get(), blockTexture(ModBlocks.FIXXSTUDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXSTUDRITE_SLAB.get()), blockTexture(ModBlocks.FIXXSTUDRITE_BLOCK.get()), blockTexture(ModBlocks.FIXXSTUDRITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.FIXXUNDRITE_STAIRS.get(), blockTexture(ModBlocks.FIXXUNDRITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXUNDRITE_SLAB.get()), blockTexture(ModBlocks.FIXXUNDRITE_BLOCK.get()), blockTexture(ModBlocks.FIXXUNDRITE_BLOCK.get()));

        stairsBlock((StairBlock) ModBlocks.FIXXUNMIUM_STAIRS.get(), blockTexture(ModBlocks.FIXXUNMIUM_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.FIXXUNMIUM_SLAB.get()), blockTexture(ModBlocks.FIXXUNMIUM_BLOCK.get()), blockTexture(ModBlocks.FIXXUNMIUM_BLOCK.get()));


        blockItem(ModBlocks.FIXXALDRITE_STAIRS);
        blockItem(ModBlocks.FIXXALDRITE_SLAB);

        blockItem(ModBlocks.FIXXANDRITE_STAIRS);
        blockItem(ModBlocks.FIXXANDRITE_SLAB);

        blockItem(ModBlocks.FIXXNUNDRITE_STAIRS);
        blockItem(ModBlocks.FIXXNUNDRITE_SLAB);

        blockItem(ModBlocks.FIXXSTUDRITE_STAIRS);
        blockItem(ModBlocks.FIXXSTUDRITE_SLAB);

        blockItem(ModBlocks.FIXXUNDRITE_STAIRS);
        blockItem(ModBlocks.FIXXUNDRITE_SLAB);

        blockItem(ModBlocks.FIXXUNMIUM_STAIRS);
        blockItem(ModBlocks.FIXXUNMIUM_SLAB);

        buttonBlock((ButtonBlock) ModBlocks.FIXXALDRITE_BUTTON.get(), blockTexture(ModBlocks.FIXXALDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXALDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXALDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.FIXXANDRITE_BUTTON.get(), blockTexture(ModBlocks.FIXXANDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXANDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXANDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.FIXXNUNDRITE_BUTTON.get(), blockTexture(ModBlocks.FIXXNUNDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXNUNDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXNUNDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.FIXXSTUDRITE_BUTTON.get(), blockTexture(ModBlocks.FIXXSTUDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXSTUDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXSTUDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.FIXXUNDRITE_BUTTON.get(), blockTexture(ModBlocks.FIXXUNDRITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXUNDRITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXUNDRITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.FIXXUNMIUM_BUTTON.get(), blockTexture(ModBlocks.FIXXUNMIUM_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.FIXXUNMIUM_PRESSURE_PLATE.get(), blockTexture(ModBlocks.FIXXUNMIUM_BLOCK.get()));


        blockItem(ModBlocks.FIXXALDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.FIXXANDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.FIXXNUNDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.FIXXSTUDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.FIXXUNDRITE_PRESSURE_PLATE);
        blockItem(ModBlocks.FIXXUNMIUM_PRESSURE_PLATE);
    }
private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("fixxinit_additions:block/" + ForgeRegistries.BLOCKS
                .getKey(blockRegistryObject.get()).getPath()));
}


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
