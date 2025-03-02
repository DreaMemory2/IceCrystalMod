package com.ice.crystal.item;

import com.ice.crystal.CrystalMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;

/**
 * @author Crystal
 * @version 1.0
 * @since 1.0
 */
public class ModItemRegistry {

	public static final Item ICE_COAL = registerItems("ice_coal", new Item(new Item.Settings()));
	public static final Item ICE_STONE = new Item(new Item.Settings());

	public static void registerItems(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "ice_coal"), ICE_STONE);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(ICE_STONE);
		});
	}

	public static Item registerItems(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(CrystalMod.MOD, name), item);
	}

	public static void register() {
		CrystalMod.LOGGER.info("Items has registered");
	}
}
