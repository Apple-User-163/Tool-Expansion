package net.apple163.tool_expansion.item;

import net.apple163.tool_expansion.ToolExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomGroup {

    public static final ItemGroup TOOLEXPANSION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ToolExpansion.MOD_ID, "toolexpansion_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.toolexpansion_group"))
                    .icon(() -> new ItemStack(ModItems.ICON)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                    }).build());

    public static void registerItemGroups() {
        ToolExpansion.LOGGER.info("Registering item groups for " + ToolExpansion.MOD_ID);
    }
}
