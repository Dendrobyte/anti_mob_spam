package me.mobkinz78.antimobspam.event;

import me.mobkinz78.antimobspam.util.SpawnTimer.base.SpawnNumberTimer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author cat
 * @since December 04, 2016
 * <p>
 * Fired when a SpawnNumberTimer has reached its timeout
 */
public class TimeOutEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final SpawnNumberTimer spawnNumberTimer;

	public TimeOutEvent(SpawnNumberTimer spawnNumberTimer) {
		this.spawnNumberTimer = spawnNumberTimer;
	}

	public HandlerList getHandlers() {
		return TimeOutEvent.handlers;
	}

	public SpawnNumberTimer getSpawnNumberTimer() {
		return this.spawnNumberTimer;
	}
}
