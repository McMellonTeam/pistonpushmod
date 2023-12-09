package net.louis.pistonpushmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PistonPushMod implements ModInitializer {
	public static final String MOD_ID = "pistonpushmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final GameRules.Key<GameRules.IntRule> PISTON_PUSHING_LIMIT =  GameRuleRegistry.register("PistonPushingLimit", GameRules.Category.MISC, GameRuleFactory.createIntRule(12,0,512));


	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}