package com.xiaoanovo.anplant.Command;

import org.bukkit.entity.Player;

public class AdminCommand {
    public static void adminCommand(Player player, String[] args){
        if (args.length == 0){
            player.sendMessage("§9================AnPlant-植树小游戏================");
            player.sendMessage("§c管理员命令菜单:");
            player.sendMessage("§9/anplant ");
        }

    }
}
