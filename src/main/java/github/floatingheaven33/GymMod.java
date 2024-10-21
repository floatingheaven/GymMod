package github.floatingheaven33;

import github.floatingheaven33.registry.ItemGroupRegistry;
import github.floatingheaven33.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GymMod implements ModInitializer {
	public static final String MOD_ID = "gymmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemGroupRegistry.loadGroup();
		ItemRegistry.load();
		LOGGER.info("Gym mod initializing ");
		LOGGER.info("Hello Fabric world!");
	}
	public static Identifier id(String path){
		return Identifier.of(MOD_ID, path);
	}
}