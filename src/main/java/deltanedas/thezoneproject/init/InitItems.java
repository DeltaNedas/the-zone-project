package deltanedas.thezoneproject.init;

import deltanedas.thezoneproject.TheZoneProject;
import deltanedas.thezoneproject.items.BaseItem;
import net.minecraft.item.Item;

public class InitItems {
	public static Item wolfTail;
	public static Item pseudowolfTail;
	public static Item snorkFoot;
	public static Item bloodsuckerTentacles;
	// public static Potion veryStrongLeaping;
	// public static Potion veryStrongSwiftness;

	public InitItems() {
		TheZoneProject.snorkFoot.setCreativeTab(TheZoneProject.modTab);
		wolfTail = new BaseItem("wolf_tail");
		pseudowolfTail = new BaseItem("pseudowolf_tail");
		snorkFoot = TheZoneProject.snorkFoot;
		bloodsuckerTentacles = new BaseItem("bloodsucker_tentacles");
	}
}
