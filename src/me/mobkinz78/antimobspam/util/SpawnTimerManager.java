package me.mobkinz78.antimobspam.util;

import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cat
 * @since December 04, 2016
 */
public class SpawnTimerManager {

	private final Map<CreatureSpawnEvent.SpawnReason, SpawnNumberTimer> spawnTimers;

	public SpawnTimerManager() {
		this.spawnTimers = new HashMap<>();
	}

	public void addCreature(CreatureSpawnEvent event) {
		/*
		 * ugh you basically need to figure out if an
		 * event is "close enough" to the events which
		 * have been put into another timer.
		 * for instance: was the spawn in world xyz
		 * also really caused by the same thing
		 * which caused the spawn in world abc
		 *
		 * So for the non-directly-player-caused events
		 * you kinda just guess? mostly based off of
		 * chunks and the dispenser/spawner coords
		 */

	}

	public Map<CreatureSpawnEvent.SpawnReason, SpawnNumberTimer> getSpawnTimers() {
		return this.spawnTimers;
	}
}
