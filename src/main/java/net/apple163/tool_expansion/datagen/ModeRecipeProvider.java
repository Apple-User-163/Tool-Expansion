package net.apple163.tool_expansion.datagen;

import net.apple163.tool_expansion.block.ModBlocks;
import net.apple163.tool_expansion.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.Collections;

public class ModeRecipeProvider extends FabricRecipeProvider {
    public ModeRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBlasting(exporter, Collections.singletonList(ModBlocks.RAW_RUBY_BLOCK), RecipeCategory.MISC, ModBlocks.RUBY_BLOCK, 1.5F, 350, "ruby");
        offerBlasting(exporter, Collections.singletonList(ModItems.RAW_RUBY), RecipeCategory.MISC, ModItems.RUBY, 1.0F, 200, "ruby");
        offerBlasting(exporter, Collections.singletonList(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModBlocks.RAW_RUBY_BLOCK, 0.9F, 150, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
    }
}
