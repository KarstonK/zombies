package cf.kars.spigot.zombies;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.entity.Zombie;
public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        saveDefaultConfig();
        reloadConfig();
        getServer().getPluginManager().registerEvents(new onSpawn(), this);
        //getCommand("command").setExecutor(new Spawns(this));
        //this.getServer().getPluginManager().registerEvents(this.onSpawn, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}