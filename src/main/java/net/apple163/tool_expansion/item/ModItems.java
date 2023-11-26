package net.apple163.tool_expansion.item;

import net.apple163.tool_expansion.ToolExpansion;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item ICON = registerItem("icon", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    private static void addItems(FabricItemGroupEntries builder)
    {
        // Add items to the creative tab
        builder.add(RUBY);
        builder.add(RAW_RUBY);
    }
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(ToolExpansion.MOD_ID, name), item);
    }

    public static void registerItems()
    {
        ToolExpansion.LOGGER.info("Registering items for " + ToolExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItems);
    }
}