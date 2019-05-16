package deltanedas.thezoneproject.items;

import deltanedas.thezoneproject.BaseModel;
import deltanedas.thezoneproject.TheZoneProject;
import net.minecraft.item.Item;

public class BaseItem extends Item implements BaseModel {
	public BaseItem(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(TheZoneProject.modTab);
		
		TheZoneProject.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		TheZoneProject.proxy.registerItemRender(this, 0);
	}
}
