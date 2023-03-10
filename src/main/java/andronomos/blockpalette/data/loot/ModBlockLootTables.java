package andronomos.blockpalette.data.loot;

import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
	@Override
	protected void addTables() {
		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockType = b.getClass().getSimpleName();

			switch(blockType) {
				case "SlabBlock" -> {
					this.add(b, BlockLoot::createSlabItemTable);
				}
				default -> this.dropSelf(b);
			}
		});
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}
