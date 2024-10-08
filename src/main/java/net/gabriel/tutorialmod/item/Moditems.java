package net.gabriel.tutorialmod.item;

import net.gabriel.tutorialmod.TutorialMod;
import net.gabriel.tutorialmod.item.custom.DenseAlloyBallItem;
import net.gabriel.tutorialmod.item.custom.TungstenCasingItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> HORN_FOSSIL = ITEMS.register("horn_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METALLIC_FOSSIL = ITEMS.register("metallic_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_TIRE = ITEMS.register("old_tire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAIL_FOSSIL = ITEMS.register("tail_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WING_FOSSIL = ITEMS.register("wing_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOTOR_ENGINE = ITEMS.register("motor_engine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DENSE_ALLOY_BALL = ITEMS.register("dense_alloy_ball",
            () -> new DenseAlloyBallItem(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_CASING = ITEMS.register("tungsten_casing",
            () -> new TungstenCasingItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
