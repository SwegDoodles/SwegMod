package net.sweg.swegmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SWEG_TAB = new CreativeModeTab("swegtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DOLLAR.get());
        }
    };
}
