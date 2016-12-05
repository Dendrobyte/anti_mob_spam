package me.mobkinz78.antimobspam.event;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class SpawnEvent implements Listener {

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event){
        Entity entity = event.getEntity();
        //Spawn Reasons
        CreatureSpawnEvent.SpawnReason dispenser = CreatureSpawnEvent.SpawnReason.DISPENSE_EGG;
        CreatureSpawnEvent.SpawnReason egg = CreatureSpawnEvent.SpawnReason.EGG;
        CreatureSpawnEvent.SpawnReason spawner_egg = CreatureSpawnEvent.SpawnReason.SPAWNER_EGG;
        CreatureSpawnEvent.SpawnReason spawner = CreatureSpawnEvent.SpawnReason.SPAWNER;

        //Dispensers, DISPENSE_EGG
        if(event.getSpawnReason() == dispenser){
            System.out.println("A mob has been spawned by DISPENSE_EGG");
            //If a dispenser can not be found...
            //Use location to register if there are more than X mobs in an area Y large.
            //If there are any players nearby, send them a message.
        }
        //Chicken Egg, EGG
        if(event.getSpawnReason() == egg){
            System.out.println("A mob has been spawned by EGG");
        }
        //Spawner Egg, SPAWNER_EGG
        if(event.getSpawnReason() == spawner_egg){
            System.out.println("A mob has been spawned by SPAWNER_EGG");
        }
        //Spawner, SPAWNER (in case of hackers)
        if(event.getSpawnReason() == spawner){
            System.out.println("A mob has been spawned by SPAWNER");
        }
        //Chunk Gen (possible future update for max mobs in a chunk)
        /*
        Get the spawned entity, get the chunk it's in.
        If that chunk already has X amount of entities of the same type, cancel spawn event.
        Make specific per world.
         */
    }

}
