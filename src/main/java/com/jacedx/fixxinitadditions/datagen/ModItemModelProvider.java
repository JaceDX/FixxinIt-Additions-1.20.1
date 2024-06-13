package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import com.jacedx.fixxinitadditions.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FixxinitAdditions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FIXXALDRITE_INGOT);
        simpleItem(ModItems.RAW_FIXXALDRITE);

        simpleItem(ModItems.FIXXANDRITE_INGOT);
        simpleItem(ModItems.RAW_FIXXANDRITE);

        simpleItem(ModItems.FIXXNUNDRITE_INGOT);
        simpleItem(ModItems.RAW_FIXXNUNDRITE);

        simpleItem(ModItems.FIXXSTUDRITE_INGOT);
        simpleItem(ModItems.RAW_FIXXSTUDRITE);

        simpleItem(ModItems.FIXXUNDRITE_INGOT);
        simpleItem(ModItems.RAW_FIXXUNDRITE);

        simpleItem(ModItems.FIXXUNMIUM_INGOT);
        simpleItem(ModItems.RAW_FIXXUNMIUM);

        simpleItem(ModItems.FIXXUNDRITE_LOCATOR);


        complexBlock(ModBlocks.FIXXANDRITE_OUTER_MACHINE_HULL.get());
    }
    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(FixxinitAdditions.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FixxinitAdditions.MOD_ID, "item/" + item.getId().getPath()));
    }
}
