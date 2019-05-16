package deltanedas.thezoneproject.entities.render;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.entities.model.ModelBlindWolf;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderBlindWolf extends RenderLiving<EntityLiving> {
	
	public static ResourceLocation textures = new ResourceLocation(Constants.MOD_ID + ":textures/entities/blind_wolf.png");
	
	public RenderBlindWolf(RenderManager manager) {
		super(manager, new ModelBlindWolf(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return textures;
	}
}