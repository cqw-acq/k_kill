package org.example.helloworld.k_kill;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class K_kill extends JavaPlugin {

    @Override
    public void onEnable() {
        // 在插件启用时注册命令
        this.getCommand("k").setExecutor(new SuicideCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
