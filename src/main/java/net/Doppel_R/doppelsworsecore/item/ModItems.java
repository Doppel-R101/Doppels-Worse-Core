package net.Doppel_R.doppelsworsecore.item;

import net.Doppel_R.doppelsworsecore.doppelsworsecore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, doppelsworsecore.MOD_ID);

    public static final RegistryObject<Item> StarCore = ITEMS.register("star_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DimensionalStar = ITEMS.register("dimensional_star_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ExplorationStar = ITEMS.register("exploration_star_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MagicalStar = ITEMS.register("magical_star_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FarmStar = ITEMS.register("farming_star_part",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HunterStar = ITEMS.register("hunter_star_part",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
