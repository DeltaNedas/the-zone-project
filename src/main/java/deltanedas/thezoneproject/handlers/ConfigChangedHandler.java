package deltanedas.thezoneproject.handlers;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.TheZoneProject;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigChangedHandler {
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		TheZoneProject.log("config changed lol");
		if (event.getModID().contentEquals(Constants.MOD_ID)) {
			TheZoneProject.log("its my config!");
			ConfigManager.sync(Constants.MOD_ID, Config.Type.INSTANCE);
		}
	}
}
