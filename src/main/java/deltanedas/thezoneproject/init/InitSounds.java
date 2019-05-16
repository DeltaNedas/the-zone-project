package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.Constants;
import deltanedas.thezoneproject.TheZoneProject;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class InitSounds {
	public static SoundEvent snorkAmbient;
	public static SoundEvent snorkLeap;
	public static SoundEvent snorkAttack;
	public static SoundEvent snorkHurt;
	public static SoundEvent snorkDeath;
	
	public static SoundEvent blindWolfAmbient;
	public static SoundEvent blindWolfLeap;
	public static SoundEvent blindWolfAttack;
	public static SoundEvent blindWolfHurt;
	public static SoundEvent blindWolfDeath;
	
	public InitSounds() {
		snorkAmbient = newSound("snork_ambient");
		snorkLeap = newSound("snork_leap");
		snorkAttack = newSound("snork_attack");
		snorkHurt = newSound("snork_hurt");
		snorkDeath = newSound("snork_death");
		
		blindWolfAmbient = SoundEvents.ENTITY_WOLF_WHINE;
		blindWolfLeap = SoundEvents.ENTITY_WOLF_PANT;
		blindWolfAttack = SoundEvents.ENTITY_WOLF_GROWL;
		blindWolfHurt = SoundEvents.ENTITY_WOLF_HOWL;
		blindWolfDeath = SoundEvents.ENTITY_WOLF_DEATH;
	}
	
	public static SoundEvent newSound(String name) {
		ResourceLocation location = new ResourceLocation(Constants.MOD_ID, name);
		SoundEvent sound = new SoundEvent(location).setRegistryName(location);
		TheZoneProject.SOUNDS.add(sound);
		return sound;
	}
}
