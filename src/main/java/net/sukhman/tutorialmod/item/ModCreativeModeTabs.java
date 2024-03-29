/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.sukhman.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sukhman.tutorialmod.TutorialMod;
import net.sukhman.tutorialmod.block.ModBlocks;

/**
 *
 * @author Sukhman
 */
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,TutorialMod.MOD_ID);
    
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",() ->
        CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
            .title(Component.translatable("creativetab.tutorial_tab"))
            .displayItems((pParameters,pOutput) ->
            {
                pOutput.accept(ModItems.SAPPHIRE.get());
                pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                pOutput.accept(ModBlocks.NAZI_BLOCK.get());
            })
            .build());
    
    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
