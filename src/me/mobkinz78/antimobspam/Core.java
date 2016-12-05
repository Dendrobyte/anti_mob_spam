package me.mobkinz78.antimobspam;

import me.mobkinz78.antimobspam.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by markbacon78 on 11/28/16.
 */
public class Core extends JavaPlugin {

    private static Core instance;

    private int timeOut;
    private int spawnsPerReason;


    @Override
    public void onEnable(){
        String authors = "";
        for (String s: this.getDescription().getAuthors()) {
            authors += s + " ";
        }
        System.out.printf("%s by %s has been initialized.", this.getDescription().getName(), authors);

        //Register Events
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new DispenseListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
        // custom events
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnNumberExceedListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new TimeOutListener(), this);

        //Register Commands (if any)

        // Load settings
        this.timeOut = this.getConfig().getInt("time-out");
        this.spawnsPerReason = this.getConfig().getInt("spawns-per-reason");

        /*
         * Moved this to the bottom...
         * really it's just to make me happy but
         * there could potentially be some issues
         * where it is accessed before everything
         * is fully instantiated. Only relevant
         * for multithreaded programs though
         */
        Core.instance = this;
    }

    @Override
    public void onDisable(){
        System.out.printf("%s has been uninitialized", this.getDescription().getName());
    }

    public static Core getInstance(){
        return Core.instance;
    }

    public int getTimeOut() {
        return this.timeOut;
    }

    public int getSpawnsPerReason() {
        return this.spawnsPerReason;
    }
}
