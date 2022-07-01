package com.xiaoanovo.anplant.Command;

import org.bukkit.entity.Player;


public class GameSet {
    public static void gameSet(Player player, String[] args) {
        if (args.length == 1) {
            player.sendMessage("§9==========================AnPlant-游戏设置==========================");
            player.sendMessage("§9/anplant set name [游戏名] [name]  §e设置游戏的名字(在游戏列表中的名称)");
            player.sendMessage("§9/anplant set loc1 [游戏名]         §e设置游戏区域的一端(“长方体的左上角”)");
            player.sendMessage("§9/anplant set loc2 [游戏名]         §e设置游戏区域的另一端(“长方体的右下角”)");
            player.sendMessage("§9/anplant set lobby [游戏名]        §e设置游戏的等待大厅");
            player.sendMessage("§9/anplant set max [游戏名] [max]    §e设置游戏的最大人数[max]");
            player.sendMessage("§9/anplant set min [游戏名] [min]    §e设置最小游戏开始人数[min]");
        }
    }
}
