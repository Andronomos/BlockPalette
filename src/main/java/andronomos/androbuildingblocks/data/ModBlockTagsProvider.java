package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
	public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, AndroBuildingBlocks.MODID, existingFileHelper);
	}

	@Override
	public String getName() {
		return "AndroBuildingBlocks Tags";
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockType = b.getClass().getSimpleName();

			switch (blockType) {
				case "ConcretePowderBlock" -> tag(BlockTags.MINEABLE_WITH_SHOVEL).add(b);
				default -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(b);
			}

			if(blockType.equals("WallBlock")) {
				tag(BlockTags.WALLS).add(b);
			}
		});
	}
}
