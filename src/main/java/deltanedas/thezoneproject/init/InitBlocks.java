package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.blocks.BaseSkull;
import net.minecraft.block.Block;

public class InitBlocks {
	public static Block skullBlindWolf;
	public static Block skullPseudowolf;
	public static Block skullSnork;
	public static Block skullBloodsucker;
	
	public InitBlocks() {
		skullBlindWolf = new BaseSkull("blind_wolf");
		skullPseudowolf = new BaseSkull("pseudowolf");
		skullSnork = new BaseSkull("snork");
		skullBloodsucker = new BaseSkull("bloodsucker");
	}
}
