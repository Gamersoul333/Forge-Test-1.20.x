package net.gabriel.tutorialmod.item.custom;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TungstenCasingItem extends Item {
    public TungstenCasingItem(Properties pProperties) {
        super(new Properties().stacksTo(1)); // Set stack size to 1
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tutorialmod.tungstencasing.tooltip")
                .setStyle(Style.EMPTY.withColor(0xFF0000)));

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
