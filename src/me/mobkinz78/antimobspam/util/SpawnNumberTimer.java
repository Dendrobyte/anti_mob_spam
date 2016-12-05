package me.mobkinz78.antimobspam.util;

import me.mobkinz78.antimobspam.event.SpawnNumberExceedEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * @author cat
 * @since December 04, 2016
 * <p>
 * Handles the reason and number of creatures caused by a spawn reason.
 */
public class SpawnNumberTimer {

	private final CreatureSpawnEvent.SpawnReason spawnReason;
	private final int spawnsPerReason;
	private int creatures;

	public SpawnNumberTimer(int spawnsPerReason, CreatureSpawnEvent.SpawnReason spawnReason) {
		this.spawnReason = spawnReason;
		this.spawnsPerReason = spawnsPerReason;
		this.creatures = 0;
	}

	public void addCreature() {
		// adds one to the creatures count and then checks to see if it is greater than the max allowed
		if (++this.creatures > this.spawnsPerReason)
			Bukkit.getServer().getPluginManager().callEvent(new SpawnNumberExceedEvent(this));
	}

}
