package me.mobkinz78.antimobspam;

import me.mobkinz78.antimobspam.event.DispenseEvent;
import me.mobkinz78.antimobspam.event.PlayerInteract;
import me.mobkinz78.antimobspam.event.SpawnEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class Core extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable(){
        String authors = "";
        for (String s: this.getDescription().getAuthors()) {
            authors += s + " ";
        }
        System.out.printf("%s by %s has been initialized.", this.getDescription().getName(), authors);
        Core.plugin = this;

        //Register Events
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new DispenseEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);

        //Register Commands (if any)
    }

    @Override
    public void onDisable(){
        System.out.println("AntiMobSpam has been uninitialized");
    }

    public static Plugin getPlugin(){
        return Core.plugin;
    }

}
