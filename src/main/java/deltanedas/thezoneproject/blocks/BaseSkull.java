package deltanedas.thezoneproject.blocks;

import deltanedas.thezoneproject.TheZoneProject;
import net.minecraft.block.BlockSkull;
import net.minecraft.item.ItemBlock;

public class BaseSkull extends BlockSkull {
	
	public BaseSkull(String name) {
		super();
		name = "skull_" + name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(TheZoneProject.modTab);
		
		TheZoneProject.BLOCKS.add(this);
		TheZoneProject.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}
