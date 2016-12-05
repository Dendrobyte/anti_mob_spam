package me.mobkinz78.antimobspam.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.SpawnEgg;

/**
 * Code written by Mark, "Mobkinz78" on 11/29/2016.
 * Twitter: @Mobkinz78
 * Website: Soon to be... hopefully...
 * §
 */
public class PlayerInteractListener implements Listener {

	@EventHandler
	public void playerInteract(PlayerInteractEvent event) {
		// if the player actually has an item
		if (!event.hasItem())
			return;
		// if the item is not something we are interested in
		if (event.getItem().getType().getData() != SpawnEgg.class)
			return;
	}

}
