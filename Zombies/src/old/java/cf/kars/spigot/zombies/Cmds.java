package cf.kars.spigot.zombies;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class Cmds implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("/" + cmd + " help for this menu");
            sender.sendMessage("/" + cmd + " reload to reload the config");
        } else if (args.length == 1) {
            if (args[0] == "help") {
            sender.sendMessage("/" + cmd + " help for this menu");
            sender.sendMessage("/" + cmd + " reload to reload the config");
            } else if (args[0] == "reload") {
                sender.sendMessage("Reloading config.");
                //reloadConfig();
                sender.sendMessage("Finished reloading config.");
            } else {
                sender.sendMessage("Unknown argument.");
            }
        } else {
            sender.sendMessage("Too many arguments.");
        }
        return true;
    }
}