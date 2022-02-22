package com.xiaoanovo.anplant;

import com.xiaoanovo.anplant.Command.AdminCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Acommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§4你必须是一个玩家！");
        }
        Player p = (Player) sender;
        if (p.hasPermission("anplant.admin")) {
            AdminCommand.adminCommand(p, args);
        }
        return true;
    }
}
