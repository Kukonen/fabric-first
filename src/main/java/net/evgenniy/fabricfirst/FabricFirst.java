package net.evgenniy.fabricfirst;

import net.evgenniy.fabricfirst.block.ModBlocks;
import net.evgenniy.fabricfirst.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricFirst implements ModInitializer {

	public static final String MOD_ID = "fabricfirst";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
