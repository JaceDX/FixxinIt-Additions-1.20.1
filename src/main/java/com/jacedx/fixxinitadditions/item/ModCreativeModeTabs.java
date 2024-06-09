package com.jacedx.fixxinitadditions.item;

import com.jacedx.fixxinitadditions.FixxinitAdditions;
import com.jacedx.fixxinitadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FixxinitAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FIXXINIT_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("fixxinit_additions",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FIXXANDRITE_INGOT.get()))
                    .title(Component.translatable("creativetab.fixxinitadditions_tab")).displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FIXXALDRITE_INGOT.get());
                        output.accept(ModItems.FIXXANDRITE_INGOT.get());
                        output.accept(ModItems.FIXXNUNDRITE_INGOT.get());
                        output.accept(ModItems.FIXXSTUDRITE_INGOT.get());
                        output.accept(ModItems.FIXXUNDRITE_INGOT.get());
                        output.accept(ModItems.FIXXUNMIUM_INGOT.get());

                        output.accept(ModItems.RAW_FIXXALDRITE.get());
                        output.accept(ModItems.RAW_FIXXANDRITE.get());
                        output.accept(ModItems.RAW_FIXXNUNDRITE.get());
                        output.accept(ModItems.RAW_FIXXSTUDRITE.get());
                        output.accept(ModItems.RAW_FIXXUNDRITE.get());
                        output.accept(ModItems.RAW_FIXXUNMIUM.get());

                        output.accept(ModBlocks.FIXXALDRITE_BLOCK.get());
                        output.accept(ModBlocks.FIXXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.FIXXNUNDRITE_BLOCK.get());
                        output.accept(ModBlocks.FIXXSTUDRITE_BLOCK.get());
                        output.accept(ModBlocks.FIXXUNDRITE_BLOCK.get());
                        output.accept(ModBlocks.FIXXUNMIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_FIXXALDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_FIXXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_FIXXNUNDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_FIXXSTUDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_FIXXUNDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_FIXXUNMIUM_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
