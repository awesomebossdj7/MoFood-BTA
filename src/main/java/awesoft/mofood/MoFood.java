package awesoft.mofood;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFoodStackable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.helper.RecipeHelper;


import java.util.Properties;


public class MoFood implements ModInitializer {
    public static final String MOD_ID = "mofood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ConfigHandler config;
	static {
		// Config
		Properties prop = new Properties();
		prop.setProperty("ids.rawsteak", "32000");
		prop.setProperty("ids.steak", "32001");
		prop.setProperty("ids.rawmutton", "32002");
		prop.setProperty("ids.mutton", "32003");
		prop.setProperty("ids.rawporkchop", "32004");
		prop.setProperty("ids.porkchop", "32005");

		config = new ConfigHandler(MOD_ID, prop);
	}

	//items
	public static final Item foodsteakraw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.steak.raw", config.getInt("ids.rawsteak"), 2, true, 64), "food.steak.raw", "beef_raw.png");
	public static final Item foodsteak = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.steak", config.getInt("ids.steak"), 8, true, 64), "food.steak", "beef_cooked.png");
	public static final Item foodmuttonraw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.mutton.raw", config.getInt("ids.rawmutton"), 2, true, 64), "food.mutton.raw", "mutton_raw.png");
	public static final Item foodmutton = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.mutton", config.getInt("ids.mutton"), 6, true, 64), "food.mutton", "mutton_cooked.png");
	public static final Item foodporkchopraw = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.porkchop.raw", config.getInt("ids.rawporkchop"), 2, true, 64), "food.porkchop.raw", "porkchop_raw.png");
	public static final Item foodporkchop = ItemHelper.createItem(MOD_ID, new ItemFoodStackable("food.porkchop", config.getInt("ids.porkchop"), 6, true, 64), "food.porkchop", "porkchop_cooked.png");




	@Override
    public void onInitialize() {
        LOGGER.info("MoFood initialized.");
		recipes.register();
    }
}
