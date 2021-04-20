package cf.kars.spigot.zombies;
import org.bukkit.Bukkit;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.attribute.Attribute;
public class Spawns implements Listener {
    private Main plugin;
    Spawns(Main plugin){
        this.plugin = plugin;
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSpawn(CreatureSpawnEvent cse){
        if (cse.getSpawnReason() == SpawnReason.NATURAL ) {
            if (cse.getEntity() instanceof Zombie) {
                String name = plugin.getConfig().getString("zombies");
                Zombie z = (Zombie) cse.getEntity();
            } else {
                cse.setCancelled(true);
            }
        }
    }
}