package deltanedas.thezoneproject.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBloodsucker extends ModelBase {
    public ModelRenderer LowerBody;
    public ModelRenderer UpperBody;
    public ModelRenderer RightUpperLeg;
    public ModelRenderer LeftUpperLeg;
    public ModelRenderer Head;
    public ModelRenderer RightUpperArm;
    public ModelRenderer LeftUpperArm;
    public ModelRenderer Mouth;
    public ModelRenderer Tentacle;
    public ModelRenderer Tentacle_1;
    public ModelRenderer Tentacle_2;
    public ModelRenderer Tentacle_3;
    public ModelRenderer Tentacle_4;
    public ModelRenderer Tentacle_5;
    public ModelRenderer Tentacle_6;
    public ModelRenderer Tentacle_7;
    public ModelRenderer Tentacle_8;
    public ModelRenderer Tentacle_9;
    public ModelRenderer Tentacle_10;
    public ModelRenderer Tentacle_11;
    public ModelRenderer RightLowerArm;
    public ModelRenderer LeftLowerArm;
    public ModelRenderer RightLowerLeg;
    public ModelRenderer LeftLowerLeg;

    public ModelBloodsucker() {
        this.textureWidth = 80;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Head.addBox(-4.0F, -2.0F, -10.0F, 8, 7, 10, 0.0F);
        this.setRotateAngle(Head, 0.17453292519943295F, 0.0F, 0.0F);
        this.LeftUpperArm = new ModelRenderer(this, 36, 0);
        this.LeftUpperArm.setRotationPoint(6.3F, -8.5F, -3.0F);
        this.LeftUpperArm.addBox(-3.0F, 0.0F, -2.0F, 6, 12, 4, 0.0F);
        this.setRotateAngle(LeftUpperArm, 0.3490658503988659F, 0.0F, -0.3490658503988659F);
        this.RightLowerArm = new ModelRenderer(this, 52, 16);
        this.RightLowerArm.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.RightLowerArm.addBox(-2.0F, 0.0F, -4.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(RightLowerArm, -1.2292353921796064F, 0.0F, 0.0F);
        this.Tentacle_2 = new ModelRenderer(this, 62, 58);
        this.Tentacle_2.setRotationPoint(1.1F, 2.8F, 0.7F);
        this.Tentacle_2.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_2, -0.4979424355939822F, 0.6508332780686855F, -1.5707963267948966F);
        this.Tentacle_11 = new ModelRenderer(this, 72, 60);
        this.Tentacle_11.setRotationPoint(0.0F, -0.1F, -2.2F);
        this.Tentacle_11.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_11, -0.4155628948998498F, 0.17453292519943295F, 0.0F);
        this.Tentacle_4 = new ModelRenderer(this, 67, 59);
        this.Tentacle_4.setRotationPoint(0.1F, 0.0F, -2.8F);
        this.Tentacle_4.addBox(0.0F, 0.1F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_4, 0.1034384754608913F, -0.5453946575417175F, 0.0F);
        this.LeftLowerArm = new ModelRenderer(this, 36, 16);
        this.LeftLowerArm.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.LeftLowerArm.addBox(-2.0F, 0.0F, -4.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(LeftLowerArm, -1.2292353921796064F, 0.0F, 0.0F);
        this.Tentacle_3 = new ModelRenderer(this, 62, 58);
        this.Tentacle_3.setRotationPoint(3.0F, 3.0F, 0.2F);
        this.Tentacle_3.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_3, 0.6949901081441421F, 0.6991788983489284F, -1.4374531719425299F);
        this.Tentacle_10 = new ModelRenderer(this, 67, 59);
        this.Tentacle_10.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.Tentacle_10.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_10, -0.19041542139258133F, 0.03647738136668149F, 0.0F);
        this.LowerBody = new ModelRenderer(this, 0, 32);
        this.LowerBody.setRotationPoint(0.0F, 9.3F, 0.0F);
        this.LowerBody.addBox(-5.0F, -9.0F, 0.0F, 10, 9, 6, 0.0F);
        this.setRotateAngle(LowerBody, 0.3490658503988659F, 0.0F, 0.0F);
        this.UpperBody = new ModelRenderer(this, 0, 17);
        this.UpperBody.setRotationPoint(0.0F, -9.0F, 6.0F);
        this.UpperBody.addBox(-6.0F, -9.0F, -6.0F, 12, 9, 6, 0.0F);
        this.setRotateAngle(UpperBody, 0.17453292519943295F, 0.0F, 0.0F);
        this.Tentacle_5 = new ModelRenderer(this, 72, 60);
        this.Tentacle_5.setRotationPoint(0.0F, -0.1F, -2.5F);
        this.Tentacle_5.addBox(0.0F, 0.1F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_5, -0.18605209826259553F, -0.08726646259971647F, 0.0F);
        this.Tentacle = new ModelRenderer(this, 62, 58);
        this.Tentacle.setRotationPoint(-0.4F, 0.5F, 0.2F);
        this.Tentacle.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle, 0.6890559886873613F, 0.8289739028258931F, 0.3010366524260367F);
        this.RightLowerLeg = new ModelRenderer(this, 48, 47);
        this.RightLowerLeg.setRotationPoint(0.0F, 10.0F, -5.0F);
        this.RightLowerLeg.addBox(-4.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(RightLowerLeg, 0.3490658503988659F, 0.0F, 0.0F);
        this.RightUpperLeg = new ModelRenderer(this, 48, 33);
        this.RightUpperLeg.setRotationPoint(-0.5F, 0.0F, 5.0F);
        this.RightUpperLeg.addBox(-4.0F, 0.0F, -5.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(RightUpperLeg, -0.6981317007977318F, 0.04363323129985824F, 0.08726646259971647F);
        this.Tentacle_1 = new ModelRenderer(this, 62, 58);
        this.Tentacle_1.setRotationPoint(5.1F, 1.3F, -0.1F);
        this.Tentacle_1.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_1, -0.0646936071621852F, 0.5277875658030852F, -2.943951980556146F);
        this.Tentacle_8 = new ModelRenderer(this, 67, 59);
        this.Tentacle_8.setRotationPoint(-0.1F, 0.0F, -2.7F);
        this.Tentacle_8.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_8, 0.36425021489121656F, 0.22759093446006054F, 0.136659280431156F);
        this.Mouth = new ModelRenderer(this, 66, 53);
        this.Mouth.setRotationPoint(-2.5F, 1.5F, -11.5F);
        this.Mouth.addBox(0.0F, 0.0F, 0.0F, 5, 3, 2, 0.0F);
        this.setRotateAngle(Mouth, -0.17453292519943295F, 0.0F, 0.0F);
        this.LeftLowerLeg = new ModelRenderer(this, 32, 47);
        this.LeftLowerLeg.setRotationPoint(0.0F, 10.0F, -5.0F);
        this.LeftLowerLeg.addBox(0.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(LeftLowerLeg, 0.3490658503988659F, 0.0F, 0.0F);
        this.Tentacle_7 = new ModelRenderer(this, 72, 60);
        this.Tentacle_7.setRotationPoint(-0.1F, 0.2F, -2.6F);
        this.Tentacle_7.addBox(0.0F, 0.0F, -2.7F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_7, -0.136659280431156F, -0.06335545184739416F, -0.2209586833024821F);
        this.Tentacle_9 = new ModelRenderer(this, 72, 60);
        this.Tentacle_9.setRotationPoint(0.1F, 0.0F, -2.6F);
        this.Tentacle_9.addBox(0.0F, 0.0F, -2.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_9, 0.04345869837465881F, -0.2527236756887789F, 0.0F);
        this.LeftUpperLeg = new ModelRenderer(this, 32, 33);
        this.LeftUpperLeg.setRotationPoint(0.5F, 0.0F, 5.0F);
        this.LeftUpperLeg.addBox(0.0F, 0.0F, -5.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(LeftUpperLeg, -0.6981317007977318F, -0.04363323129985824F, -0.08726646259971647F);
        this.RightUpperArm = new ModelRenderer(this, 56, 0);
        this.RightUpperArm.setRotationPoint(-6.3F, -8.5F, -3.0F);
        this.RightUpperArm.addBox(-3.0F, 0.0F, -2.0F, 6, 12, 4, 0.0F);
        this.setRotateAngle(RightUpperArm, 0.3490658503988659F, 0.0F, 0.3490658503988659F);
        this.Tentacle_6 = new ModelRenderer(this, 67, 59);
        this.Tentacle_6.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Tentacle_6.addBox(0.0F, 0.0F, -2.6F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Tentacle_6, -0.49892757270534366F, -0.14084985863125166F, 0.0F);
        this.UpperBody.addChild(this.Head);
        this.UpperBody.addChild(this.LeftUpperArm);
        this.RightUpperArm.addChild(this.RightLowerArm);
        this.Mouth.addChild(this.Tentacle_2);
        this.Tentacle_10.addChild(this.Tentacle_11);
        this.Tentacle.addChild(this.Tentacle_4);
        this.LeftUpperArm.addChild(this.LeftLowerArm);
        this.Mouth.addChild(this.Tentacle_3);
        this.Tentacle_3.addChild(this.Tentacle_10);
        this.LowerBody.addChild(this.UpperBody);
        this.Tentacle_4.addChild(this.Tentacle_5);
        this.Mouth.addChild(this.Tentacle);
        this.RightUpperLeg.addChild(this.RightLowerLeg);
        this.LowerBody.addChild(this.RightUpperLeg);
        this.Mouth.addChild(this.Tentacle_1);
        this.Tentacle_2.addChild(this.Tentacle_8);
        this.Head.addChild(this.Mouth);
        this.LeftUpperLeg.addChild(this.LeftLowerLeg);
        this.Tentacle_6.addChild(this.Tentacle_7);
        this.Tentacle_8.addChild(this.Tentacle_9);
        this.LowerBody.addChild(this.LeftUpperLeg);
        this.UpperBody.addChild(this.RightUpperArm);
        this.Tentacle_1.addChild(this.Tentacle_6);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.LowerBody.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
