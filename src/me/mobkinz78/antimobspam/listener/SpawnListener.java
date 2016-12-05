package me.mobkinz78.antimobspam.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class SpawnListener implements Listener {

     private static final CreatureSpawnEvent.SpawnReason SPAWNER = CreatureSpawnEvent.SpawnReason.SPAWNER;
     private static final CreatureSpawnEvent.SpawnReason SPAWNER_EGG = CreatureSpawnEvent.SpawnReason.SPAWNER_EGG;
     private static final CreatureSpawnEvent.SpawnReason DISPENSE_EGG = CreatureSpawnEvent.SpawnReason.DISPENSE_EGG;
     private static final CreatureSpawnEvent.SpawnReason EGG = CreatureSpawnEvent.SpawnReason.EGG;

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event){
        CreatureSpawnEvent.SpawnReason spawnReason = event.getSpawnReason();

        // I don't know why the spawner check is actually necessary but w/e
        if (!spawnReason.name().contains("EGG") && spawnReason != CreatureSpawnEvent.SpawnReason.SPAWNER)
            // We aren't checking these so...
            return;
        System.out.printf("A mob has been spawned via %s", spawnReason.name());

    }

}
