package me.starboy.files.GUI;

import me.starboy.files.Utils.Color;
import me.starboy.files.Utils.Items;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Settings implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
        if (cmd.equalsIgnoreCase("coresettings")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(Color.add("&B&LError:&F&LYou are not a Player"));
                return true;
            }

            Player player = (Player) sender;

            Inventory inventory =  Bukkit.createInventory(null,54,Color.add("&B&LCore &F&LSettings"));

            ItemStack ender = Items.create(Material.ENDER_CHEST,1,"&B&LMYSQL &F&LSETUP","&7Click me to setup your MYSQL Database.");


            ItemStack advencedsettings = Items.create(Material.DETECTOR_RAIL,1,"&B&LAdvanced &F&LSettings","&7Configure Advenced Settings Options;&7Make sure that everything you made here;&7will result in a urgent change.");


            player.openInventory(inventory);
            inventory.setItem(10,ender);
            inventory.setItem(13,advencedsettings);



        }
        return true;
    }


}
