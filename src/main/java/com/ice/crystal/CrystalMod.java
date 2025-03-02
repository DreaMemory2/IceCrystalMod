package com.ice.crystal;

import com.ice.crystal.item.ModItemRegistry;
import com.ice.crystal.registry.ModItemGroup;
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
	public static final String MOD = "ice_crystal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD);

	@Override
	public void onInitialize(ModContainer mod) {
		/* 方块和物品初始化 */
		/*ModItemRegistry.register();*/
		ModItemRegistry.registerItems(mod);

		/* 标签页初始化 */
		ModItemGroup.register();

		LOGGER.info("The Ice Crystal Mod has been initialized");
	}
}
