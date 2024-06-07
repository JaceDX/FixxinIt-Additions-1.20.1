package com.jacedx.fixxinitadditions;   // i don't like making the stupid textures for the stupid items and blocks ;(

import com.jacedx.fixxinitadditions.block.ModBlocks;
import com.jacedx.fixxinitadditions.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FixxinitAdditions.MOD_ID)
public class FixxinitAdditions {

    public static final String MOD_ID = "fixxinit_additions";


    private static final Logger LOGGER = LogUtils.getLogger();

    public FixxinitAdditions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.FIXXALDRITE_INGOT);
            event.accept(ModItems.FIXXANDRITE_INGOT);
            event.accept(ModItems.FIXXNUNDRITE_INGOT);
            event.accept(ModItems.FIXXSTUDRITE_INGOT);
            event.accept(ModItems.FIXXUNDRITE_INGOT);
            event.accept(ModItems.FIXXUNMIUM_INGOT);

            event.accept(ModItems.RAW_FIXXALDRITE);
            event.accept(ModItems.RAW_FIXXANDRITE);
            event.accept(ModItems.RAW_FIXXNUNDRITE);
            event.accept(ModItems.RAW_FIXXSTUDRITE);
            event.accept(ModItems.RAW_FIXXUNDRITE);
            event.accept(ModItems.RAW_FIXXUNMIUM);
        }
            if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
                event.accept(ModBlocks.FIXXALDRITE_BLOCK);
                event.accept(ModBlocks.FIXXANDRITE_BLOCK);
                event.accept(ModBlocks.FIXXNUNDRITE_BLOCK);
                event.accept(ModBlocks.FIXXSTUDRITE_BLOCK);
                event.accept(ModBlocks.FIXXUNDRITE_BLOCK);
                event.accept(ModBlocks.FIXXUNMIUM_BLOCK);

                event.accept(ModBlocks.RAW_FIXXALDRITE_BLOCK);
                event.accept(ModBlocks.RAW_FIXXANDRITE_BLOCK);
                event.accept(ModBlocks.RAW_FIXXNUNDRITE_BLOCK);
                event.accept(ModBlocks.RAW_FIXXSTUDRITE_BLOCK);
                event.accept(ModBlocks.RAW_FIXXUNDRITE_BLOCK);
                event.accept(ModBlocks.RAW_FIXXUNMIUM_BLOCK);
            }
        }
    }

