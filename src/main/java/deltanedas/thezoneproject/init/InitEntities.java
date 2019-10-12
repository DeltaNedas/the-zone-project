package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.TheZoneProject;
import deltanedas.thezoneproject.entities.EntityBlindWolf;
import deltanedas.thezoneproject.entities.EntityBloodsucker;
// import deltanedas.thezoneproject.entities.EntityPseudowolf;
import deltanedas.thezoneproject.entities.EntitySnork;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class InitEntities {

	public InitEntities() {
		EntityBlindWolf.registerEntity();
		//Pseudowolf.registerEntity();
		EntitySnork.registerEntity();
		Bloodsucker.registerEntity();
	}

	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colourPrimary, int colourSecondary) {
		EntityRegistry.registerModEntity(new ResourceLocation(Constants.MOD_ID + ":" + name), entity, name, id, TheZoneProject.instance, range, 1, true, colourPrimary, colourSecondary);
	}
}
