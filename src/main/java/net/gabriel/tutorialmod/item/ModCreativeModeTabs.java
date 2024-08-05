package net.gabriel.tutorialmod.item;

import net.gabriel.tutorialmod.TutorialMod;
import net.gabriel.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public  static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.WING_FOSSIL.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.HORN_FOSSIL.get());
                        output.accept(Moditems.METALLIC_FOSSIL.get());
                        output.accept(Moditems.OLD_TIRE.get());
                        output.accept(Moditems.TAIL_FOSSIL.get());
                        output.accept(Moditems.WING_FOSSIL.get());
                        output.accept(Moditems.MOTOR_ENGINE.get());
                        output.accept(Moditems.TUNGSTEN_BALL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
