package me.marni.betterthansprint.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.PlayerLocal;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = PlayerLocal.class, remap = false)
public abstract class MixinPlayerLocal extends Player {
	@Shadow
	protected Minecraft mc;

	public MixinPlayerLocal(World world) {
		super(world);
	}

	@Override
	public void sendMessage(String message) {
		this.mc.hudIngame.addChatMessage(message);
	}

	@Override
	public void sendStatusMessage(String message) {
		this.mc.hudIngame.heldItemTooltipElement.setString(message);
	}
}
