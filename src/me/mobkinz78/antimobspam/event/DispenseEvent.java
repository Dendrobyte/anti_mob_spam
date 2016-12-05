package me.mobkinz78.antimobspam.event;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class DispenseEvent implements Listener {

    @EventHandler
    public void dispenseEvent(BlockDispenseEvent event){
        Block dispenser = event.getBlock();
        System.out.println("Dispenser that just dispensed ANYTHING is: " + dispenser.getLocation().toString());
        ItemStack egg = new ItemStack(Material.MONSTER_EGG);
        ItemStack stone = new ItemStack(Material.STONE);

        if(event.getItem().equals(egg)){
            System.out.println("Dispenser that dispenses eggs has successfully dispensed an egg. Dispenser: " + dispenser.getLocation().toString());
        }
        if(event.getItem().equals(stone)) System.out.println("A MONSTER_EGG has been successfully detected as the dispensed item.");

    }

}
