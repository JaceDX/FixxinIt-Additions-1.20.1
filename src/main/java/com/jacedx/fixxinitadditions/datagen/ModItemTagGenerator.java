package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> completableFuture,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, FixxinitAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // ITEM TAGS PLS
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
