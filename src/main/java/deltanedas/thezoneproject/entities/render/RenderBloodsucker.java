package deltanedas.thezoneproject.entities.render;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.entities.EntityBloodsucker;
import deltanedas.thezoneproject.entities.model.ModelBloodsucker;
import deltanedas.thezoneproject.entities.render.layers.LayerBloodsuckerEyes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBloodsucker extends RenderLiving<EntityLiving> {
	public static ResourceLocation textures = new ResourceLocation(Constants.MOD_ID + ":textures/entities/bloodsucker.png");

	public RenderBloodsucker(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelBloodsucker(), 0.5F);
		this.addLayer(new LayerBloodsuckerEyes(this));
	}

	protected float getDeathMaxRotation(T entityLivingBaseIn) {
		return 180.0F;
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return textures;
	}
}