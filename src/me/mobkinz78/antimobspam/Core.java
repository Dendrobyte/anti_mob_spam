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

        //Register Events
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new DispenseEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);

        //Register Commands (if any)

        /*
         * Moved this to the bottom...
         * really it's just to make me happy but
         * there could potentially be some issues
         * where it is accessed before everything
         * is fully instantiated. Only relevant
         * for multithreaded programs though
         */
        Core.plugin = this;
    }

    @Override
    public void onDisable(){
        System.out.printf("%s has been uninitialized", this.getDescription().getName());
    }

    public static Plugin getPlugin(){
        /*
         * You don't want a null-pointer so you add
         * this check. This is another reason for
         * making Core.plugin private
         */
        if (Core.plugin == null)
            return new Core();
        return Core.plugin;
    }

}
