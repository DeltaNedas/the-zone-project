package deltanedas.thezoneproject.init;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.Config.RequiresMcRestart;

@Config(modid = "thezoneproject")
public class InitConfig {
	// Startup stuff
	@Comment("If body parts can be used in recipes.")
	@RequiresMcRestart
	public static boolean enableBodyPartRecipes = true;
	
	@Comment("If mobs can mutate into mutants.")
	@RequiresMcRestart
	public static boolean mobsCanMutate = true;
	
	@Comment("Difficulty level. 1: Novice, 2: Stalker, 3: Veteran, 4: Master")
	@RangeInt(min = 1, max = 4)
	@RequiresMcRestart
	public static int difficulty = 2;
	
	// Runtime stuff
	
	@Comment("1 in X chance of having a mob mutate. (Multiplied by individual mutation chance)")
	@RangeInt(min = 1, max = 1000)
	public static int mobMutateChance = 2;

	@Comment("1 in X chance of having a Wolf mutate into a Pseudowolf")
	@RangeInt(min = 1, max = 1000)
	public static int pseudowolfMutateChance = 5;
	
	@Comment("1 in X chance of having a Wolf mutate into a Blind Wolf, if it is not a Pseudowolf.")
	@RangeInt(min = 1, max = 1000)
	public static int blindWolfMutateChance = 1;
	
	@Comment("1 in X chance of having a Zombie mutate into a Bloodsucker.")
	@RangeInt(min = 1, max = 1000)
	public static int bloodsuckerMutateChance = 20;
	
	@Comment("1 in X chance of having a Zombie mutate into a Snork, if it is not a Bloodsucker.")
	@RangeInt(min = 1, max = 1000)
	public static int snorkMutateChance = 5;
}

