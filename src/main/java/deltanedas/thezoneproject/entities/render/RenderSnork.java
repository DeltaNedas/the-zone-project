package deltanedas.thezoneproject.entities.render;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.entities.model.ModelSnork;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderSnork extends RenderLiving<EntityLiving> {
	
	public static ResourceLocation textures = new ResourceLocation(Constants.MOD_ID + ":textures/entities/snork.png");
	
	public RenderSnork(RenderManager manager) {
		super(manager, new ModelSnork(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return textures;
	}
}