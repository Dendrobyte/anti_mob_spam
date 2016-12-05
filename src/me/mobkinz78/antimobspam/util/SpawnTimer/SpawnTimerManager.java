package me.mobkinz78.antimobspam.util.SpawnTimer;

import me.mobkinz78.antimobspam.util.SpawnTimer.impl.PlayerSpawnTimer;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cat
 * @since December 04, 2016
 */
public class SpawnTimerManager {

	private static SpawnTimerManager instance;

	private static List<PlayerSpawnTimer> spawnTimers;

	private SpawnTimerManager() {
		SpawnTimerManager.spawnTimers = new ArrayList<>();
	}

	public static SpawnTimerManager getInstance() {
		if (SpawnTimerManager.instance == null)
			return new SpawnTimerManager();
		return SpawnTimerManager.instance;
	}

	public static void addPlayerTimer(Player player) {

	}

	public static void addCreature(CreatureSpawnEvent event) {
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

}
