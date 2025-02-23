package com.ice.crystal;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class CrystalMod implements ModInitializer {
	private static final String MOD = "ice_crystal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("The Ice Crystal Mod has been initialized");
	}
}
