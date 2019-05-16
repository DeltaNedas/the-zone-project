package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.handlers.ConfigChangedHandler;
import deltanedas.thezoneproject.handlers.DeathEventHandler;
import net.minecraftforge.common.MinecraftForge;

public class InitEvents {
	public InitEvents() {
		registerEvent(new ConfigChangedHandler());
		if (InitConfig.mobsCanMutate) {
			registerEvent(new DeathEventHandler());
		}
	}
	
	public static void registerEvent(Object handler) {
		MinecraftForge.EVENT_BUS.register(handler);
	}
}