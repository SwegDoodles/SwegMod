package net.sweg.swegmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweg.swegmod.SwegMod;
import net.sweg.swegmod.block.ModBlocks;
import net.sweg.swegmod.item.custom.MoneyBlockSword;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SwegMod.MOD_ID);

    public static final RegistryObject<Item> DOLLAR = ITEMS.register("dollar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SWEG_TAB)));

    public static final RegistryObject<Item> DOLLAR_5 = ITEMS.register("5dollar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SWEG_TAB)));

    public static final RegistryObject<Item> MONEY_BLOCK_SWORD = ITEMS.register("money_block_sword",
            () -> new MoneyBlockSword(Tiers.NETHERITE, 11, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.SWEG_TAB).stacksTo(1)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.SWEG_TAB)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SWEG_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
