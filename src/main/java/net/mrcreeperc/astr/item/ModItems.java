package net.mrcreeperc.astr.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrcreeperc.astr.AstrMod;

public class ModItems {

    public static final Item ASTRAL_STONE = registerItem("astral_stone",
            new Item(new FabricItemSettings().maxCount(12).group(ModItemGroup.ASTRAL_TRAVEL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AstrMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AstrMod.LOGGER.info("Registering Mod Items for " + AstrMod.MOD_ID);

    }
}