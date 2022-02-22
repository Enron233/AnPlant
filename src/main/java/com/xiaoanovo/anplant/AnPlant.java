package com.xiaoanovo.anplant;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AnPlant extends JavaPlugin {

    @Override
    public void onEnable() {
        ins = this;
        Bukkit.getPluginCommand("anplant").setExecutor(new Acommand());
        this.getLogger().info("§aHello~我是小安，感谢你使用我的插件~");
        this.getLogger().info("§a插件加载成功！");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    private static AnPlant ins;
    public static AnPlant getIns(){
        return ins;
    }
}
