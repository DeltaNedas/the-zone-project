package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.Recipes;
import net.minecraft.init.Items;

public class InitRecipes {
	public InitRecipes() {
		if (InitConfig.enableBodyPartRecipes) { // If Body Part recipes are enabled.
			Recipes.addSmelting(InitItems.wolfTail, 1, Items.LEATHER, 3, 6);
			Recipes.addSmelting(InitItems.pseudowolfTail, 1, Items.LEATHER, 6, 12);
			Recipes.addSmelting(InitItems.snorkFoot, 1, Items.LEATHER, 4, 8);
			Recipes.addSmelting(InitItems.bloodsuckerTentacles, 1, Items.LEATHER, 8, 16);

			// Recipes.addBrewing(PotionTypes.STRONG_LEAPING, InitItems.snorkFoot, InitItems.veryStrongLeaping);
			// Recipes.addBrewing(PotionTypes.STRONG_SWIFTNESS, InitItems.snorkFoot, InitItems.veryStrongSwiftness);
		}
	}
}
