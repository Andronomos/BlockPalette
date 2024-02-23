package andronomos.blockpalette.data;

import andronomos.blockpalette.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
		//region Rough Concrete
		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_WHITE_POWDER.get(), Items.WHITE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_TILE.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BLUE_POWDER.get(), Items.BLUE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_TILE.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BLACK_POWDER.get(), Items.BLACK_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_TILE.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BROWN_POWDER.get(), Items.BROWN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_TILE.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_GREEN_POWDER.get(), Items.GREEN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_TILE.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_GRAY_POWDER.get(), Items.GRAY_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_TILE.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_ORANGE_POWDER.get(), Items.ORANGE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_TILE.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_PURPLE_POWDER.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_TILE.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_RED_POWDER.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_TILE.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_RED_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_RED_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_RED_WALL.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_WALL.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_YELLOW_POWDER.get(), Items.YELLOW_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_TILE.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_WALL.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_WALL.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		//endregion

		//region Borderless Glass
		generateSingleItemShapelessRecipe(BlockRegistry.WHITE_BORDERLESS_GLASS.get(), Blocks.WHITE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.WHITE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.WHITE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BLUE_BORDERLESS_GLASS.get(), Blocks.BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLUE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BROWN_BORDERLESS_GLASS.get(), Blocks.BROWN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BROWN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BROWN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.CYAN_BORDERLESS_GLASS.get(), Blocks.CYAN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.CYAN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.CYAN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.GREEN_BORDERLESS_GLASS.get(), Blocks.GREEN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GREEN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.GREEN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.GRAY_BORDERLESS_GLASS.get(), Blocks.GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GRAY_BORDERLESS_GLASS_PANE.get(), BlockRegistry.GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIME_BORDERLESS_GLASS.get(), Blocks.LIME_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIME_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIME_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.MAGENTA_BORDERLESS_GLASS.get(), Blocks.MAGENTA_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.MAGENTA_BORDERLESS_GLASS_PANE.get(), BlockRegistry.MAGENTA_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.ORANGE_BORDERLESS_GLASS.get(), Blocks.ORANGE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ORANGE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.ORANGE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.PINK_BORDERLESS_GLASS.get(), Blocks.PINK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PINK_BORDERLESS_GLASS_PANE.get(), BlockRegistry.PINK_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.PURPLE_BORDERLESS_GLASS.get(), Blocks.PURPLE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PURPLE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.PURPLE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.RED_BORDERLESS_GLASS.get(), Blocks.RED_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.RED_BORDERLESS_GLASS_PANE.get(), BlockRegistry.RED_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.YELLOW_BORDERLESS_GLASS.get(), Blocks.YELLOW_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.YELLOW_BORDERLESS_GLASS_PANE.get(), BlockRegistry.YELLOW_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BLACK_BORDERLESS_GLASS.get(), Blocks.BLACK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLACK_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BLACK_BORDERLESS_GLASS.get(), recipeConsumer);
		//endregion

		generateSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);

		generateStoneCutterRecipe(BlockRegistry.SLATE_PILLAR.get(), BlockRegistry.SLATE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.SLATE_TILE.get(), BlockRegistry.SLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SLATE_GRATE.get(), BlockRegistry.SLATE.get(), 1, recipeConsumer);

		generateStoneCutterRecipe(BlockRegistry.SLATE_STAIRS.get(), BlockRegistry.SLATE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SLATE_SLAB.get(), BlockRegistry.SLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SLATE_TILE_STAIRS.get(), BlockRegistry.SLATE_TILE.get().asItem(), recipeConsumer);
		generateSlabRecipe(BlockRegistry.SLATE_TILE_SLAB.get(), BlockRegistry.SLATE_TILE.get().asItem(), recipeConsumer);

		ShapedRecipeBuilder slateRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SLATE.get(), 4);
		slateRecipe.define('1', Items.CLAY_BALL);
		slateRecipe.define('2', Items.GUNPOWDER);
		slateRecipe.pattern("121");
		slateRecipe.pattern("212");
		slateRecipe.pattern("121");
		slateRecipe.unlockedBy("has_item", has(BlockRegistry.SLATE.get()));
		slateRecipe.save(recipeConsumer);
	}

	private void generateSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void generateSingleItemShapelessRecipe(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder shapeless = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,
				output, 1);
		shapeless.requires(sourceBlock.asItem());
		shapeless.unlockedBy("has_item", has(sourceBlock));
		shapeless.save(consumer);
	}

	private void generateRoughConcretePowder(Block output, Item dye, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shaped.define('#', dye);
		shaped.define('1', Tags.Items.STONE);
		shaped.define('2', Items.GRAVEL);
		shaped.pattern("#11");
		shaped.pattern("112");
		shaped.pattern("222");
		shaped.unlockedBy("has_item", has(Tags.Items.STONE));
		shaped.save(consumer);
	}

	private void generateTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = ForgeRegistries.BLOCKS.getKey(output).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		//stonecutting.group(getVariantName(output));
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void generateSlabRecipe(SlabBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStairRecipe(StairBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
