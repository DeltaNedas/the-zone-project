package deltanedas.thezoneproject.entities;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.TheZoneProject;
import deltanedas.thezoneproject.entities.render.RenderBloodsucker;
import deltanedas.thezoneproject.init.InitBlocks;
import deltanedas.thezoneproject.init.InitConfig;
import deltanedas.thezoneproject.init.InitEntities;
import deltanedas.thezoneproject.init.InitSounds;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityBloodsucker extends EntityZombie {
	static int id = 46733;
	static String name = "bloodsucker";

	float sizeX = 1f;
	float sizeY = 2.25f;
	float eyeHeight = 2f;

	int maxSpawned = 3;

	double movementSpeed = 0.4d;
	double attackDamage = 7.0d;
	double maxHealth = 60.0d;
	double armour = 8.0d;
	double armourToughness = 3.0d;

	ResourceLocation lootTable = new ResourceLocation(Constants.MOD_ID, "entities/bloodsucker");

	public EntityBloodsucker(World world) {
		super(world);
		switch (InitConfig.difficulty) {
			case 1:
				armour *= 2;
				attackDamage *= 0.5;
				break;
			case 3:
				armour *= 1.25;
				attackDamage *= 1.25;
				break;
			case 4:
				armour *= 1.5;
				attackDamage *= 1.5;
				break;
		}
		setSize(sizeX, sizeY);
		setHealth((float) maxHealth);
	}

	public static void registerEntity() {
		InitEntities.registerEntity(name, EntityBloodsucker.class, id, 30, 10328457, 4934475);
		RenderingRegistry.registerEntityRenderingHandler(EntityBloodsucker.class, new IRenderFactory<EntityBloodsucker>() {
			@Override
			public Render<? super EntityBloodsucker> createRenderFor(RenderManager manager) {
				return new RenderBloodsucker(manager);
			}
		});
	}

	@Override
	protected void initEntityAI() {
    tasks.addTask(0, new EntityAIMoveTowardsRestriction(this, 1.0D));
    tasks.addTask(1, new EntityAIZombieAttack(this, 1.0D, false));
		tasks.addTask(2, new EntityAIAttackMelee(this, 1.5d, true));
		tasks.addTask(3, new EntityAILeapAtTarget(this, 5.0f));
		tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1.0d));
		tasks.addTask(5, new EntityAILookIdle(this));
	}

	@Override
	protected void applyEntityAttributes() {
		TheZoneProject.log("attributes");
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(movementSpeed);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attackDamage);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(armour);
		getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(armourToughness);
	}

	@Override
	public boolean canPickUpLoot() {
		return false;
	}

	@Override
	protected ResourceLocation getLootTable() {
		return lootTable;
	}

	@Override
	public void setArmsRaised(boolean armsRaised) {
	}

	@Override
	public boolean isChild() {
		return false;
	}

	@Override
	public void setChild(boolean child) {
	}

	@Override
	protected boolean shouldBurnInDay() {
		return false;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
    playSound(InitSounds.bloodsuckerAttack, 5.0f, 1.0f);
		return super.attackEntityFrom(source, amount);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	public float getEyeHeight() {
		return eyeHeight;
	}

	@Override
	protected ItemStack getSkullDrop() {
		return new ItemStack(Item.getItemFromBlock(InitBlocks.skullBloodsucker), 1, 0);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return InitSounds.bloodsuckerAmbient;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return InitSounds.bloodsuckerHurt;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return InitSounds.bloodsuckerDeath;
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return maxSpawned;
	}

	public double getRadiationLevel() {
		return 0;
	}
}
