package me.mobkinz78.antimobspam;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class Core extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable(){
        System.out.println("AntiMobSpam by Bot_Patrick and Mobkinz78 has been initialized.");
        plugin = this;

        //Register Events
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new DispenseEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);

        //Register Commands (if any)
    }

    @Override
    public void onDisable(){
        System.out.println("AntiMobSpam has been unitialized");
    }

    public static Plugin getPlugin(){
        return plugin;
    }

}
