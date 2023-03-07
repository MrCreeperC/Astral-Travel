package net.mrcreeperc.astr.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrcreeperc.astr.AstrMod;
import net.mrcreeperc.astr.item.ModItemGroup;

public class ModBlocks {

    public static final Block ASTRAL_STONE_BLOCK = registerBlock("astral_stone_block",
            new Block(FabricBlockSettings.of(Material.STONE, MapColor.MAGENTA).strength(3.0F, 3.0F).requiresTool()), ModItemGroup.ASTRAL_TRAVEL);




    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AstrMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AstrMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void RegisterModBlocks() {
        AstrMod.LOGGER.info("Registering ModBlocks for" + AstrMod.MOD_ID);
    }
}

