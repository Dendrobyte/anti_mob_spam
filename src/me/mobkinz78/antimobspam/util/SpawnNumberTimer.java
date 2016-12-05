package me.mobkinz78.antimobspam.util;

import me.mobkinz78.antimobspam.Core;
import me.mobkinz78.antimobspam.event.SpawnNumberExceedEvent;
import me.mobkinz78.antimobspam.event.TimeOutEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cat
 * @since December 04, 2016
 * <p>
 * Handles the reason and number of creatures caused by a spawn reason.
 */
public class SpawnNumberTimer {

	private final List<CreatureSpawnEvent> creatureSpawns;
	private final CreatureSpawnEvent.SpawnReason spawnReason;
	private long lastSpawn;
	private int creatures;

	public SpawnNumberTimer(CreatureSpawnEvent event) {
		this.creatureSpawns = new ArrayList<>();
		this.spawnReason = event.getSpawnReason();
		this.lastSpawn = System.currentTimeMillis();
		this.creatures = 0;

		this.creatureSpawns.add(event);
	}

	public List<CreatureSpawnEvent> getCreatureSpawns() {
		return this.creatureSpawns;
	}

	public CreatureSpawnEvent.SpawnReason getSpawnReason() {
		return this.spawnReason;
	}

	public void addCreature(CreatureSpawnEvent event) {
		// the "1000" is converting from ms to s
		if ((System.currentTimeMillis() - this.lastSpawn) / 1000 > Core.getInstance().getTimeOut()) {
			Bukkit.getServer().getPluginManager().callEvent(new TimeOutEvent(this));
			return;
		}
		// update for the timeout
		this.lastSpawn = System.currentTimeMillis();

		// adds one to the creatures count and then checks to see if it is greater than the max allowed
		if (++this.creatures > Core.getInstance().getSpawnsPerReason())
			Bukkit.getServer().getPluginManager().callEvent(new SpawnNumberExceedEvent(this));

		this.creatureSpawns.add(event);
	}

}
