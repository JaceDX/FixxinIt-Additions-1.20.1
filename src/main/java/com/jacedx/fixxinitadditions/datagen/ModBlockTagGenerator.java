package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import com.jacedx.fixxinitadditions.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FixxinitAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.FIXXUNDRITE_LOCATOR_VALUABLES)
                .add(ModBlocks.DEEPSLATE_FIXXALDRITE_ORE.get()).addTag(Tags.Blocks.ORES)
                .add(ModBlocks.NETHER_FIXXANDRITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_FIXXNUNDRITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_FIXXSTUDRITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_FIXXUNDRITE_ORE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
