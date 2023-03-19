package io.github.cats1337;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ForceCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // if console sends command, tell it they can't and need to be a player
        if(!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use points commands!");
            return true;
        }
        // forceend command
        if (label.equalsIgnoreCase("forceend") || label.equalsIgnoreCase("fe")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "endbattle " + sender.getName());
            sender.sendMessage(ChatColor.BLUE + "Battle Force Ended!");
            return true;
        }
        return false;
    }
    
}
