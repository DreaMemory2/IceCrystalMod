package com.ice.crystal;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

/**
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ClientCrystalMod implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		CrystalMod.LOGGER.info("Client Ice Crystal Mod has been initialized");
	}
}
