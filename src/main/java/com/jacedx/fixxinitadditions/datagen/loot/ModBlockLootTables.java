package com.jacedx.fixxinitadditions.datagen.loot;

import com.jacedx.fixxinitadditions.block.ModBlocks;
import com.jacedx.fixxinitadditions.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FIXXALDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXALDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXANDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXANDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXNUNDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXNUNDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXSTUDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXSTUDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXUNDRITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXUNDRITE_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXUNMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_FIXXUNMIUM_BLOCK.get());

        this.dropSelf(ModBlocks.FIXXANDRITE_OUTER_MACHINE_HULL.get());


        this.add(ModBlocks.DEEPSLATE_FIXXALDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FIXXALDRITE_ORE.get(), ModItems.RAW_FIXXALDRITE.get()));

        this.add(ModBlocks.NETHER_FIXXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.NETHER_FIXXANDRITE_ORE.get(), ModItems.RAW_FIXXANDRITE.get()));

        this.add(ModBlocks.DEEPSLATE_FIXXNUNDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FIXXNUNDRITE_ORE.get(), ModItems.RAW_FIXXNUNDRITE.get()));

        this.add(ModBlocks.DEEPSLATE_FIXXSTUDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FIXXSTUDRITE_ORE.get(), ModItems.RAW_FIXXSTUDRITE.get()));

        this.add(ModBlocks.DEEPSLATE_FIXXUNDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_FIXXUNDRITE_ORE.get(), ModItems.RAW_FIXXUNDRITE.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


