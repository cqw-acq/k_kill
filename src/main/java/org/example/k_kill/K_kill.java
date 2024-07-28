package org.example.k_kill;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class K_kill extends JavaPlugin {

    @Override
    public void onEnable() {
        // 在插件启用时注册命令
        this.getCommand("k").setExecutor(new SuicideCommand());
    }

    @Override
    public void onDisable() {
        // 在插件禁用时执行逻辑
    }

    public class SuicideCommand implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setHealth(0.0);
                player.sendMessage(ChatColor.RED + "你自杀了。");
                return true;
            } else {
                sender.sendMessage("这个命令只能由玩家执行。");
                return false;
            }
        }
    }
}
