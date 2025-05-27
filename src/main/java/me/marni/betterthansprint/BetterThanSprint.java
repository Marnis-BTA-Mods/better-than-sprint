package me.marni.betterthansprint;

import me.marni.betterthansprint.hud.HudManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;

public class BetterThanSprint implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "betterthansprint";
	public static final String MOD_VERSION = "1.0.0";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final HudManager hudManager = new HudManager();

	@Override
	public void onInitialize() {
		LOGGER.info("Better Than Sprint v{} initialized.", MOD_VERSION);
	}

	@Override
	public void beforeGameStart() {}

	@Override
	public void afterGameStart() {
		hudManager.onInitialize();
	}
}
