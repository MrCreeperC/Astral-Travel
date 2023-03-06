package net.mrcreeperc.astr.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.mrcreeperc.astr.AstrMod;

public class ModItemGroup {
    public static final ItemGroup ASTRAL_TRAVEL = FabricItemGroupBuilder.build(new Identifier(AstrMod.MOD_ID, "astral_travel"),
            () -> new ItemStack(ModItems.ASTRAL_STONE));
}
