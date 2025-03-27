package net.Doppel_R.doppelsworsecore.item;

import net.Doppel_R.doppelsworsecore.doppelsworsecore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public  static final DeferredRegister<CreativeModeTab> Creative_Mode_Tabs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, doppelsworsecore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Core_Tab = Creative_Mode_Tabs.register("worse_core_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.StarCore.get()))
                    .title(Component.translatable("creativetab.worse_core_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.StarCore.get());
                        output.accept(ModItems.DimensionalStar.get());
                        output.accept(ModItems.ExplorationStar.get());
                        output.accept(ModItems.MagicalStar.get());
                        output.accept(ModItems.FarmStar.get());
                        output.accept(ModItems.HunterStar.get());
                        output.accept(ModItems.Star.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        Creative_Mode_Tabs.register(eventBus);
    }
}
