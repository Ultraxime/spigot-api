package fr.ultraxime.evenus.classes;

import fr.ultraxime.evenus.abstract_classes.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Logger {
    public void onEnable(){
        this.info(this.getName() + " is Loading");

        this.saveDefaultConfig();
        this.reloadConfig();
    }

    public void info(String msg){
        Bukkit.getLogger().info(msg);
    }

    public void warn(String msg){
        Bukkit.getLogger().warning(msg);
    }

    public void error(String msg){
        Bukkit.getLogger().severe(msg);
    }
}