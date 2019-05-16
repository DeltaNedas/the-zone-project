package deltanedas.thezoneproject;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import deltanedas.thezoneproject.init.InitBlocks;
import deltanedas.thezoneproject.init.InitConfig;
import deltanedas.thezoneproject.init.InitEntities;
import deltanedas.thezoneproject.init.InitEvents;
import deltanedas.thezoneproject.init.InitItems;
import deltanedas.thezoneproject.init.InitRecipes;
import deltanedas.thezoneproject.init.InitSounds;
import deltanedas.thezoneproject.items.BaseItem;
import deltanedas.thezoneproject.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = Constants.MOD_ID,
	name = Constants.MOD_NAME,
	version = Constants.MOD_VERSION,
	acceptedMinecraftVersions = Constants.MC_VERSIONS
)
public class TheZoneProject {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final List<Entity> ENTITIES = new ArrayList<Entity>();
	public static final List<SoundEvent> SOUNDS = new ArrayList<SoundEvent>();
	
	public static Item snorkFoot = new BaseItem("snork_foot");
	
	public static final CreativeTabs modTab = (new CreativeTabs("tabTheZoneProject") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(snorkFoot);
		}
	});	
	
	@Instance
	public static TheZoneProject instance;
	
	@SidedProxy(
		clientSide = Constants.CLIENT_PROXY,
		serverSide = Constants.COMMON_PROXY
	)
	public static CommonProxy proxy;
	public static Logger logger;
	public static Level level = Level.INFO;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		log("PreInitialising...");
		new InitConfig();							// Does config stuff
		new InitItems();							// Creates the Items
		new InitBlocks();							// Creates the Skulls
		new InitSounds();							// Creates the sounds mutants use
		new InitEntities();						// Creates the Entities
		log("PreInitialised!");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		log("Initialising...");
		new InitRecipes();						// Sets the recipes
		new InitEvents();							// Mutation stuff
		log("Initialised!");
	}
	
	public static void log(String text) {
		if (logger != null) {
			logger.log(level, text);
		}
	}
}
