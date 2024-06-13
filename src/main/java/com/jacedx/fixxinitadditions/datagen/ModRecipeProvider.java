package com.jacedx.fixxinitadditions.datagen;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import com.jacedx.fixxinitadditions.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> FIXXALDRITE_SMELTABLES = List.of(ModItems.RAW_FIXXALDRITE.get(),
            ModBlocks.DEEPSLATE_FIXXALDRITE_ORE.get());
    private static final List<ItemLike> FIXXANDRITE_SMELTABLES = List.of(ModItems.RAW_FIXXANDRITE.get(),
            ModBlocks.NETHER_FIXXANDRITE_ORE.get());
    private static final List<ItemLike> FIXXNUNDRITE_SMELTABLES = List.of(ModItems.RAW_FIXXNUNDRITE.get(),
            ModBlocks.DEEPSLATE_FIXXNUNDRITE_ORE.get());
    private static final List<ItemLike> FIXXSTUDRITE_SMELTABLES = List.of(ModItems.RAW_FIXXSTUDRITE.get(),
            ModBlocks.DEEPSLATE_FIXXSTUDRITE_ORE.get());
    private static final List<ItemLike> FIXXUNDRITE_SMELTABLES = List.of(ModItems.RAW_FIXXUNDRITE.get(),
            ModBlocks.DEEPSLATE_FIXXUNDRITE_ORE.get());
    private static final List<ItemLike> FIXXUNMIUM_SMELTABLES = List.of(ModItems.RAW_FIXXUNMIUM.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXALDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXALDRITE_INGOT.get())
                .unlockedBy("has_fixxaldrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXALDRITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXALDRITE_INGOT.get())
                .requires(ModBlocks.FIXXALDRITE_BLOCK.get())
                .unlockedBy("has_fixxaldrite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.FIXXALDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXALDRITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_FIXXALDRITE_BLOCK.get());
        oreSmelting(pWriter, FIXXALDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXALDRITE_INGOT.get(), 0.25f, 200, "fixxaldrite");
        oreBlasting(pWriter, FIXXALDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXALDRITE_INGOT.get(), 0.50f, 100, "fixxaldrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXANDRITE_INGOT.get())
                .unlockedBy("has_fixxandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXANDRITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXANDRITE_INGOT.get())
                .requires(ModBlocks.FIXXANDRITE_BLOCK.get())
                .unlockedBy("has_fixxandrite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.FIXXANDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXANDRITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_FIXXANDRITE_BLOCK.get());
        oreSmelting(pWriter, FIXXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXANDRITE_INGOT.get(), 0.25f, 200, "fixxandrite");
        oreBlasting(pWriter, FIXXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXANDRITE_INGOT.get(), 0.50f, 100, "fixxandrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXNUNDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXNUNDRITE_INGOT.get())
                .unlockedBy("has_fixxnundrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXNUNDRITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXNUNDRITE_INGOT.get())
                .requires(ModBlocks.FIXXNUNDRITE_BLOCK.get())
                .unlockedBy("has_fixxnundrite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.FIXXNUNDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXNUNDRITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_FIXXNUNDRITE_BLOCK.get());
        oreSmelting(pWriter, FIXXNUNDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXNUNDRITE_INGOT.get(), 0.25f, 200, "fixxnundrite");
        oreBlasting(pWriter, FIXXNUNDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXNUNDRITE_INGOT.get(), 0.50f, 100, "fixxnundrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXSTUDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXSTUDRITE_INGOT.get())
                .unlockedBy("has_fixxstudrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXSTUDRITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXSTUDRITE_INGOT.get())
                .requires(ModBlocks.FIXXSTUDRITE_BLOCK.get())
                .unlockedBy("has_fixxstudrite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.FIXXSTUDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXSTUDRITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_FIXXSTUDRITE_BLOCK.get());
        oreSmelting(pWriter, FIXXSTUDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXSTUDRITE_INGOT.get(), 0.25f, 200, "fixxstudrite");
        oreBlasting(pWriter, FIXXSTUDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXSTUDRITE_INGOT.get(), 0.50f, 100, "fixxstudrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXUNDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXUNDRITE_INGOT.get())
                .unlockedBy("has_fixxundrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXUNDRITE_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXUNDRITE_INGOT.get())
                .requires(ModBlocks.FIXXUNDRITE_BLOCK.get())
                .unlockedBy("has_fixxundrite_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.FIXXUNDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXUNDRITE.get(),
                RecipeCategory.MISC, ModBlocks.RAW_FIXXUNDRITE_BLOCK.get());
        oreSmelting(pWriter, FIXXUNDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXUNDRITE_INGOT.get(), 0.25f, 200, "fixxundrite");
        oreBlasting(pWriter, FIXXUNDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXUNDRITE_INGOT.get(), 0.50f, 100, "fixxundrite");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXUNMIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FIXXUNMIUM_INGOT.get())
                .unlockedBy("has_fixxunmium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXUNMIUM_INGOT.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIXXUNMIUM_INGOT.get())
                .requires(ModBlocks.FIXXUNMIUM_BLOCK.get())
                .unlockedBy("has_fixxunmium_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXUNMIUM_INGOT.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_FIXXUNMIUM.get(), RecipeCategory.MISC, ModBlocks.RAW_FIXXUNMIUM_BLOCK.get());
        oreSmelting(pWriter, FIXXUNMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXUNMIUM_INGOT.get(), 0.25f, 200, "fixxunmium");
        oreBlasting(pWriter, FIXXUNMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.FIXXUNMIUM_INGOT.get(), 0.50f, 100, "fixxunmium");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIXXANDRITE_OUTER_MACHINE_HULL.get())
                .pattern("ACA")
                .pattern("BBB")
                .pattern("ACA")
                .define('A', ModItems.FIXXANDRITE_INGOT.get())
                .define('B', ModItems.FIXXUNMIUM_INGOT.get())
                .define('C', Items.SMOOTH_STONE)
                .unlockedBy("has_fixxandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXANDRITE_INGOT.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RAW_FIXXUNMIUM.get())
                .pattern("AGB")
                .pattern("HCI")
                .pattern("DEF")
                .define('A', ModItems.RAW_FIXXALDRITE.get())
                .define('B', ModItems.RAW_FIXXANDRITE.get())
                .define('C', ModItems.RAW_FIXXNUNDRITE.get())
                .define('D', ModItems.RAW_FIXXSTUDRITE.get())
                .define('E', Items.DIAMOND)
                .define('F', ModItems.RAW_FIXXUNDRITE.get())
                .define('G', Items.LAPIS_LAZULI)
                .define('H', Items.REDSTONE)
                .define('I', Items.EMERALD)
                .unlockedBy("has_fixxandrite", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FIXXANDRITE_INGOT.get()).build()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme,
                pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float
            pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer,
                RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup,
                                     String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, FixxinitAdditions.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

