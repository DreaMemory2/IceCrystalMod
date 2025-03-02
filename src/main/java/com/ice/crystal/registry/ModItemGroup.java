package com.ice.crystal.registry;

import com.ice.crystal.CrystalMod;
import com.ice.crystal.item.ModItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ModItemGroup {
	public static final RegistryKey<ItemGroup> BLOCKS = register("ice_crystal_blocks");
	public static final RegistryKey<ItemGroup> ITEMS = register("ice_crystal_items");

	private static RegistryKey<ItemGroup> register(String name) {
		return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(CrystalMod.MOD, name));
	}

	public static void register() {
		/* 标签页 */
		ItemGroupEvents.modifyEntriesEvent(ModItemGroup.ITEMS).register(e -> {
			e.addItem(ModItemRegistry.ICE_COAL);
		});
	}
}
