package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.data.client.ModBlockStateProvider;
import andronomos.androbuildingblocks.data.client.ModItemModelProvider;
import andronomos.androbuildingblocks.data.client.ModLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		ExistingFileHelper fileHelper = event.getExistingFileHelper();

		if (event.includeServer()) {
			generator.addProvider(true, new ModBlockTagsProvider(output, event.getLookupProvider(), fileHelper));
			generator.addProvider(true, ModLootTableProvider.create(output));
			generator.addProvider(true, new ModRecipeProvider(output));
		}

		if (event.includeClient()) {
			generator.addProvider(true, new ModBlockStateProvider(output, fileHelper));
			generator.addProvider(true, new ModLanguageProvider(output, "en_us"));
			generator.addProvider(true, new ModItemModelProvider(output, fileHelper));
		}
	}
}
