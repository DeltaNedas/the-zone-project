package deltanedas.thezoneproject.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelSnork extends ModelBase {
	public ModelRenderer LowerBody;
	public ModelRenderer UpperBody;
	public ModelRenderer RightUpperLeg;
	public ModelRenderer LeftUpperLeg;
	public ModelRenderer Neck;
	public ModelRenderer LeftUpperArm;
	public ModelRenderer RightUpperArm;
	public ModelRenderer Head;
	public ModelRenderer GasMask;
	public ModelRenderer LeftEye;
	public ModelRenderer RightEye;
	public ModelRenderer MouthThing;
	public ModelRenderer Tubing;
	public ModelRenderer Tubing_1;
	public ModelRenderer Tubing_2;
	public ModelRenderer LeftLowerArm;
	public ModelRenderer RightLowerArm;
	public ModelRenderer RightLowerLeg;
	public ModelRenderer LeftLowerLeg;

	public ModelSnork() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.Neck = new ModelRenderer(this, 12, 0);
		this.Neck.setRotationPoint(0.0F, -7.5F, 0.0F);
		this.Neck.addBox(-2.0F, -4.0F, -1.0F, 4, 6, 4, 0.0F);
		this.setRotateAngle(Neck, -0.7853981633974483F, 0.0F, 0.0F);
		this.Tubing_2 = new ModelRenderer(this, 0, 0);
		this.Tubing_2.setRotationPoint(0.0F, 0.5F, -1.75F);
		this.Tubing_2.addBox(-0.5F, 6.0F, -0.5F, 1, 6, 1, 0.0F);
		this.setRotateAngle(Tubing_2, 0.5235987755982988F, 0.0F, 0.0F);
		this.LeftLowerArm = new ModelRenderer(this, 0, 48);
		this.LeftLowerArm.mirror = true;
		this.LeftLowerArm.setRotationPoint(0.0F, 8.0F, 0.0F);
		this.LeftLowerArm.addBox(-1.5F, 0.0F, -3.5F, 3, 9, 3, 0.0F);
		this.setRotateAngle(LeftLowerArm, -0.27314402793711257F, 0.0F, 0.0F);
		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.setRotateAngle(Head, -0.4363323129985824F, 0.0F, 0.0F);
		this.LeftUpperArm = new ModelRenderer(this, 0, 36);
		this.LeftUpperArm.mirror = true;
		this.LeftUpperArm.setRotationPoint(7.0F, -4.0F, 1.5F);
		this.LeftUpperArm.addBox(-2.0F, 0.0F, -4.0F, 4, 8, 4, 0.0F);
		this.setRotateAngle(LeftUpperArm, -1.3962634015954636F, -0.08726646259971647F, 0.0F);
		this.Tubing = new ModelRenderer(this, 40, 25);
		this.Tubing.setRotationPoint(0.0F, 2.0F, -4.0F);
		this.Tubing.addBox(-1.5F, -4.0F, 0.0F, 3, 4, 3, 0.0F);
		this.setRotateAngle(Tubing, -0.8726646259971648F, 0.0F, 0.0F);
		this.LeftLowerLeg = new ModelRenderer(this, 16, 36);
		this.LeftLowerLeg.mirror = true;
		this.LeftLowerLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.LeftLowerLeg.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(LeftLowerLeg, 0.5235987755982988F, 0.0F, 0.0F);
		this.RightUpperArm = new ModelRenderer(this, 0, 36);
		this.RightUpperArm.setRotationPoint(-7.0F, -4.0F, 1.5F);
		this.RightUpperArm.addBox(-2.0F, 0.0F, -4.0F, 4, 8, 4, 0.0F);
		this.setRotateAngle(RightUpperArm, -1.3962634015954636F, 0.08726646259971647F, 0.0F);
		this.GasMask = new ModelRenderer(this, 0, 16);
		this.GasMask.setRotationPoint(0.0F, -9.0F, -4.0F);
		this.GasMask.addBox(-4.5F, -4.5F, 0.0F, 9, 9, 11, 0.0F);
		this.setRotateAngle(GasMask, -0.5235987755982988F, 0.0F, 0.0F);
		this.RightLowerArm = new ModelRenderer(this, 0, 48);
		this.RightLowerArm.setRotationPoint(0.0F, 8.0F, 0.0F);
		this.RightLowerArm.addBox(-1.5F, 0.0F, -3.5F, 3, 9, 3, 0.0F);
		this.setRotateAngle(RightLowerArm, -0.27314402793711257F, 0.0F, 0.0F);
		this.LowerBody = new ModelRenderer(this, 29, 13);
		this.LowerBody.setRotationPoint(0.0F, 12.0F, 9.0F);
		this.LowerBody.addBox(-5.0F, -8.0F, -2.0F, 10, 8, 4, 0.0F);
		this.setRotateAngle(LowerBody, 1.1344640137963142F, 0.0F, 0.0F);
		this.LeftEye = new ModelRenderer(this, 24, 0);
		this.LeftEye.setRotationPoint(2.0F, -1.5F, 0.0F);
		this.LeftEye.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(LeftEye, 0.17453292519943295F, 0.0F, 0.08726646259971647F);
		this.MouthThing = new ModelRenderer(this, 40, 25);
		this.MouthThing.setRotationPoint(0.0F, 2.5F, -0.5F);
		this.MouthThing.addBox(-3.0F, -1.5F, -1.0F, 6, 4, 2, 0.0F);
		this.setRotateAngle(MouthThing, -0.17453292519943295F, 0.0F, 0.0F);
		this.RightEye = new ModelRenderer(this, 24, 0);
		this.RightEye.setRotationPoint(-2.0F, -1.5F, 0.0F);
		this.RightEye.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(RightEye, 0.17453292519943295F, 0.0F, -0.08726646259971647F);
		this.RightUpperLeg = new ModelRenderer(this, 0, 36);
		this.RightUpperLeg.setRotationPoint(-3.0F, -2.5F, 0.0F);
		this.RightUpperLeg.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(RightUpperLeg, -1.3962634015954636F, 0.2617993877991494F, 0.0F);
		this.LeftUpperLeg = new ModelRenderer(this, 0, 36);
		this.LeftUpperLeg.mirror = true;
		this.LeftUpperLeg.setRotationPoint(3.0F, -2.5F, 0.0F);
		this.LeftUpperLeg.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(LeftUpperLeg, -1.3962634015954636F, -0.2617993877991494F, 0.0F);
		this.RightLowerLeg = new ModelRenderer(this, 16, 36);
		this.RightLowerLeg.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.RightLowerLeg.addBox(-2.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(RightLowerLeg, 0.5235987755982988F, 0.0F, 0.0F);
		this.Tubing_1 = new ModelRenderer(this, 0, 0);
		this.Tubing_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Tubing_1.addBox(-1.0F, 0.0F, 0.5F, 2, 6, 2, 0.0F);
		this.setRotateAngle(Tubing_1, 0.5235987755982988F, 0.0F, 0.0F);
		this.UpperBody = new ModelRenderer(this, 32, 0);
		this.UpperBody.setRotationPoint(0.0F, -8.0F, 0.0F);
		this.UpperBody.addBox(-5.0F, -7.0F, -2.5F, 10, 8, 5, 0.0F);
		this.setRotateAngle(UpperBody, 0.5235987755982988F, 0.0F, 0.0F);
		this.UpperBody.addChild(this.Neck);
		this.Tubing_1.addChild(this.Tubing_2);
		this.LeftUpperArm.addChild(this.LeftLowerArm);
		this.Neck.addChild(this.Head);
		this.UpperBody.addChild(this.LeftUpperArm);
		this.MouthThing.addChild(this.Tubing);
		this.LeftUpperLeg.addChild(this.LeftLowerLeg);
		this.UpperBody.addChild(this.RightUpperArm);
		this.Head.addChild(this.GasMask);
		this.RightUpperArm.addChild(this.RightLowerArm);
		this.GasMask.addChild(this.LeftEye);
		this.GasMask.addChild(this.MouthThing);
		this.GasMask.addChild(this.RightEye);
		this.LowerBody.addChild(this.RightUpperLeg);
		this.LowerBody.addChild(this.LeftUpperLeg);
		this.RightUpperLeg.addChild(this.RightLowerLeg);
		this.Tubing.addChild(this.Tubing_1);
		this.LowerBody.addChild(this.UpperBody);
	}
		
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.LowerBody.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		// Left Leg
		LeftUpperLeg.rotateAngleX = -1.3962634015954636f + MathHelper.cos(limbSwing * 0.662f) * 1.4f * limbSwingAmount;
		// LeftLowerLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount * 0.5f;
		
		// Right Leg
		RightUpperLeg.rotateAngleX = -1.3962634015954636f + MathHelper.cos(limbSwing * 0.662f) * 1.4f * limbSwingAmount;
		// RightLowerLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount * 0.5f;
		
		// Head
		Head.rotateAngleX = headPitch * 0.017453292f;
		Head.rotateAngleY = netHeadYaw * 0.017453292f;
	}
}
