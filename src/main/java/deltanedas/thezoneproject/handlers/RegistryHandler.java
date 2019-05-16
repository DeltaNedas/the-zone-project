package deltanedas.thezoneproject.handlers;

import deltanedas.thezoneproject.BaseModel;
import deltanedas.thezoneproject.TheZoneProject;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(TheZoneProject.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(TheZoneProject.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onSoundRegister(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(TheZoneProject.SOUNDS.toArray(new SoundEvent[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : TheZoneProject.ITEMS) {
			if (item instanceof BaseModel) {
				((BaseModel) item).registerModels();
			}
		}
		
		for (Block block : TheZoneProject.BLOCKS) {
			if (block instanceof BaseModel) {
				((BaseModel) block).registerModels();
			}
		}
	}
}
