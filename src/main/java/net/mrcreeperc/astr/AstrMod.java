package net.mrcreeperc.astr;

import net.fabricmc.api.ModInitializer;

import net.mrcreeperc.astr.block.ModBlocks;
import net.mrcreeperc.astr.entity.ModEntities;
import net.mrcreeperc.astr.item.ModItems;
import net.mrcreeperc.astr.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AstrMod implements ModInitializer {
	//Мод айди
	public static final String MOD_ID = "astr";
	public static final Logger LOGGER = LoggerFactory.getLogger("astr");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();
		GeckoLib.initialize();
		ModRegistries.registerModStuffs();
	}
}