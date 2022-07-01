package com.xiaoanovo.anplant.Command;

import com.xiaoanovo.anplant.AnPlant;
import org.bukkit.entity.Player;

import java.io.IOException;

import static com.xiaoanovo.anplant.AnPlant.getChat_prefix;

public class AdminCommand {
    public static void adminCommand(Player player, String[] args) throws IOException {
        if (args.length == 0){
            player.sendMessage("§9================AnPlant-植树小游戏================");
            player.sendMessage("§c管理员命令列表:");
            player.sendMessage("§9/anplant create [游戏名]          §e创建一场游戏");
            player.sendMessage("§9/anplant remove [游戏名]          §e删除一场游戏");
            player.sendMessage("§9/anplant set                     §e游戏设置相关指令");
            player.sendMessage("§9/anplant start [游戏名]           §e强制开始一场游戏");
            player.sendMessage("§9/anplant stop  [游戏名]           §e强制结束一场游戏");
            player.sendMessage("§9/anplant reload                  §e重载配置文件");
            player.sendMessage("§2普通玩家指令:");
            player.sendMessage("§9/anplant join [游戏名]            §e加入一场游戏");
            player.sendMessage("§9/anplant leave [游戏名]           §e离开游戏");
            player.sendMessage("§9/anplant list                    §e列出现有游戏列表");
            player.sendMessage("§9=================================================");
        }else {
            if (args[0].equalsIgnoreCase("create")){
                if (args.length == 2){
                    if (createGame(args[1])){
                        player.sendMessage(getChat_prefix() + "§c创建成功！");
                    }else {
                        player.sendMessage(getChat_prefix() + "§c该游戏已经存在，请查看配置文件夹！");
                    }
                }else {
                    player.sendMessage(getChat_prefix() +"§c参数错误，检查是不是输错了？");
                }
                return;
            }
            if (args[0].equalsIgnoreCase("remove")){
                if (args.length == 2) {
                    if (removeGame(args[1])){
                        player.sendMessage(getChat_prefix() + "§c成功删除名为 §2"+ args[1] + " §c的一场游戏！");
                    }else {
                        player.sendMessage(getChat_prefix() + "§c根本就没有 " + args[1] + " §c这个游戏！！");
                    }
                }else {
                    player.sendMessage(getChat_prefix() +"§c参数错误，检查是不是输错了？");
                }
            }
            if (args[0].equalsIgnoreCase("set")) {
                GameSet.gameSet(player, args);
                return;
            }
            player.sendMessage(getChat_prefix() +"§c参数错误，检查是不是输错了？");
        }

    }
    private static boolean createGame(String name) throws IOException {
       return AnPlant.getIns().addGameConfig(name);
    }
    private static boolean removeGame(String name) {
        return AnPlant.getIns().remGameConfig(name);
    }
}
