package cf.kars.spigot.zombies;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import javax.inject.Inject;
public class Cmds implements CommandExecutor {
    private Main plugin;
    @Inject
    public Cmds(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("/" + label + " help for this menu");
            sender.sendMessage("/" + label + " reload to reload the config");
        } else if (args.length == 1) {
            if (args[0].equals("help")) {
                sender.sendMessage("/" + label + " help for this menu");
                sender.sendMessage("/" + label + " reload to reload the config");
            } else if (args[0].equals("reload")) {
                if (sender.hasPermission("zombies.reload")) {
                    sender.sendMessage("Reloading config.");
                    plugin.reloadConfig();
                    sender.sendMessage("Finished reloading config.");
                }
            } else {
                sender.sendMessage("Unknown argument: " + args[0] + ".");
            }
        } else {
            sender.sendMessage("Too many arguments.");
        }
        return true;
    }
}