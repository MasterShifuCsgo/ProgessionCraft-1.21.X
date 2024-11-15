package net.mika.progressioncraft.item;

import net.mika.progressioncraft.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    /// make sure that the items are registered
    //list of our items that are under our modID
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    //registering the item
    public static final RegistryObject<Item> TITANIUM_ORE = ITEMS.register("titaniumore", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium", () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
