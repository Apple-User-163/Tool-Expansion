package net.apple163.tool_expansion;

import net.apple163.tool_expansion.item.CustomGroup;
import net.apple163.tool_expansion.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolExpansion implements ModInitializer {
	public static final String MOD_ID = "toolexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CustomGroup.registerItemGroups();
		ModItems.registerItems();
	}
}