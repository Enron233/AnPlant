package com.xiaoanovo.anplant;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.Objects;


public final class AnPlant extends JavaPlugin {
    public File file = new File(getDataFolder(), "\\games");
    @Override
    public void onEnable() {
        ins = this;
        if (!file.exists()){
            Boolean resp = file.mkdirs();
        }
        saveDefaultConfig();
        Objects.requireNonNull(Bukkit.getPluginCommand("anplant")).setExecutor(new Acommand());
        this.getLogger().info("§aHello~我是小安，感谢你使用我的插件~");
        this.getLogger().info("§a插件加载成功！");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    private static AnPlant ins;
    public Boolean addGameConfig(String name) throws IOException {
        File games = new File(file.getAbsolutePath(), "\\" +name+ ".yml" );
        if (!games.exists()) {
            return games.createNewFile();
        }else {
            return  false;
        }

    }
    public Boolean remGameConfig(String name) {
        File game = new File(file.getAbsolutePath(), "\\" + name + ".yml");
        if (game.exists()){
            return game.delete();
        }else {
            return false;
        }
    }
    public YamlConfiguration getGameConfig(String name) {
        File game = new File(file.getAbsolutePath(), "\\" + name + ".yml");
        if (game.exists()){
            return YamlConfiguration.loadConfiguration(game);
        }else {
            return null;
        }
    }
    public static AnPlant getIns(){
        return ins;
    }
    public static String getChat_prefix(){
        return Objects.requireNonNull(getIns().getConfig().getString("chat-prefix")).replace("&","§");
    }



}
