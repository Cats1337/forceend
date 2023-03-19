package io.github.cats1337;

import java.util.logging.Logger;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    static final Logger LOGGER = Logger.getLogger("ForceEnd");
 
    @Override
    public void onEnable() {
        LOGGER.info("ForceEnd has been enabled!");
        getServer().getPluginManager().registerEvents(this, (Plugin)this);
        
        final ForceCommand commands = new ForceCommand();
            this.getCommand("forceend").setExecutor((CommandExecutor)commands);
    }

    @Override
    public void onDisable() {
        LOGGER.info("ForceEnd has been disabled!");
    }
}
