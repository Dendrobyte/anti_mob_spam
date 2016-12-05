package me.mobkinz78.antimobspam.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cat
 * @since December 04, 2016
 */
public class SpawnTimerManager {

	private final List<SpawnNumberTimer> spawnTimers;

	public SpawnTimerManager() {
		this.spawnTimers = new ArrayList<>();
	}

	public List<SpawnNumberTimer> getSpawnTimers() {
		return spawnTimers;
	}
}
