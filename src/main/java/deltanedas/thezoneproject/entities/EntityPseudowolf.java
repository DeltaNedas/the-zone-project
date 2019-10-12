package deltanedas.thezoneproject.entities;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.entities.render.RenderPseudowolf;
import deltanedas.thezoneproject.init.InitBlocks;
import deltanedas.thezoneproject.init.InitConfig;
import deltanedas.thezoneproject.init.InitEntities;
import deltanedas.thezoneproject.init.InitSounds;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityPseudowolf extends EntityWolf {
	static int id = 46731;
	static String name = "pseudowolf";

	float sizeX = 0.6f * 1.25f;
	float sizeY = 0.85f * 1.25f;

	int maxSpawned = 12;

	double movementSpeed = 0.4d;
	double maxHealth = 12.0d;
	double attackDamage = 3.0d;
	double armour = 1.0d;
	double armourToughness = 0.0d;

	ResourceLocation lootTable = new ResourceLocation(Constants.MOD_ID, "entities/pseudowolf");

	public EntityPseudowolf(World world) {
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
		InitEntities.registerEntity(name, EntityPseudowolf.class, id, 30, 8019783, 9601656);
		RenderingRegistry.registerEntityRenderingHandler(EntityPseudowolf.class, new IRenderFactory<EntityPseudowolf>() {
			@Override
			public Render<? super EntityPseudowolf> createRenderFor(RenderManager manager) {
				return new RenderPseudowolf(manager);
			}
		});
	}

	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAILeapAtTarget(this, 1.5f));
		this.tasks.addTask(5, new EntityAIAttackMelee(this, 3.0d, true));
		this.tasks.addTask(8, new EntityAIWanderAvoidWater(this, 1.0d));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		this.tasks.addTask(10, new EntityAILookIdle(this));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(movementSpeed);
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(maxHealth);
		getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attackDamage);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(armour);
		getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(armourToughness);
	}

	protected ItemStack getSkullDrop() {
		return new ItemStack(Item.getItemFromBlock(InitBlocks.skullPseudowolf), 1, 0);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return InitSounds.blindWolfAmbient;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return InitSounds.blindWolfHurt;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return InitSounds.blindWolfDeath;
	}

	@Override
	protected ResourceLocation getLootTable() {
		return lootTable;
	}

	@Override
	public int getMaxSpawnedInChunk() {
		return maxSpawned;
	}

	public double getRadiationLevel() {
		return 0;
	}
}
