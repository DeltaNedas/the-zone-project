package deltanedas.thezoneproject.entities.render;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.entities.EntityBloodsucker;
import deltanedas.thezoneproject.entities.model.ModelBloodsucker;
import deltanedas.thezoneproject.entities.render.RenderBloodsucker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerBloodsuckerEyes<T extends EntityBloodsucker> implements LayerRenderer<T> {
	public static final ResourceLocation BLOODSUCKER_EYES = new ResourceLocation(Constants.MOD_ID + ":textures/entities/bloodsucker_eyes.png");
	private final RenderBloodsucker bloodsuckerRenderer;

	public LayerBloodsuckerEyes(RenderBloodsucker bloodsuckerRenderer) {
		this.bloodsuckerRenderer = bloodsuckerRenderer;
	}

	public void doRenderLayer(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		this.bloodsuckerRenderer.bindTexture(BLOODSUCKER_EYES);
		GlStateManager.enableBlend();
		GlStateManager.disableAlpha();
		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

		if (entitylivingbaseIn.isInvisible()) {
			GlStateManager.depthMask(false);
		} else {
			GlStateManager.depthMask(true);
		}

		int i = 61680;
		int j = i % 65536;
		int k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
		this.bloodsuckerRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
		i = entitylivingbaseIn.getBrightnessForRender();
		j = i % 65536;
		k = i / 65536;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
		this.bloodsuckerRenderer.setLightmap(entitylivingbaseIn);
		GlStateManager.disableBlend();
		GlStateManager.enableAlpha();
	}

	public boolean shouldCombineTextures() {
		return false;
	}
}