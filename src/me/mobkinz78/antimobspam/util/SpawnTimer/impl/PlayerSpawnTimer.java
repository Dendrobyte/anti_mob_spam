package me.mobkinz78.antimobspam.util.SpawnTimer.impl;

import me.mobkinz78.antimobspam.util.SpawnTimer.base.SpawnNumberTimer;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * @author cat
 * @since December 05, 2016
 */
public class PlayerSpawnTimer extends SpawnNumberTimer {

	private final Player player;

	public PlayerSpawnTimer(PlayerInteractEvent event) {
		super(CreatureSpawnEvent.SpawnReason.SPAWNER_EGG);
		this.player = event.getPlayer();
	}

	public Player getPlayer() {
		return this.player;
	}
}
