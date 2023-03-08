package net.mrcreeperc.astr.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrcreeperc.astr.AstrMod;
import net.mrcreeperc.astr.entity.ModEntities;

public class ModItems {


    //Яйца призыва
    public static final Item GHOST_SPAWN_EGG = registerItem("ghost_spawn_egg",
            new SpawnEggItem(ModEntities.ASTRAL_GHOST, 0x5065a6, 0x7190f0,
                    new FabricItemSettings().group(ModItemGroup.ASTRAL_TRAVEL)));


    //Предметы
    public static final Item ASTRAL_STONE = registerItem("astral_stone",
            new Item(new FabricItemSettings().maxCount(12).group(ModItemGroup.ASTRAL_TRAVEL).food(FoodComponents.COOKIE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AstrMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AstrMod.LOGGER.info("Registering Mod Items for " + AstrMod.MOD_ID);

    }
}