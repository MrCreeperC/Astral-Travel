package net.mrcreeperc.astr;

import net.fabricmc.api.ModInitializer;

import net.mrcreeperc.astr.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstrMod implements ModInitializer {
	//Мод айди
	public static final String MOD_ID = "astr";
	public static final Logger LOGGER = LoggerFactory.getLogger("astr");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}