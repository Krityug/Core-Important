package me.starboy.files;

import me.starboy.files.Events.SettingsEvents;
import me.starboy.files.GUI.Settings;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Core Plugin has been enabled");
        this.getCommand("coresettings").setExecutor(new Settings());
        Bukkit.getPluginManager().registerEvents(new SettingsEvents(),this);

    }

    @Override
    public void onDisable() {
        getLogger().info("Core Plugin has been disabled");
    }











}
