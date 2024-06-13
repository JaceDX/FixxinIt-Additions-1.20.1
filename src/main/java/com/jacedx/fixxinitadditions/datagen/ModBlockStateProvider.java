package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
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
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
