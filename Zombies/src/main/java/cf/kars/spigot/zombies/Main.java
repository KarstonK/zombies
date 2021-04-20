package cf.kars.spigot.zombies;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.google.inject.Injector;
import javax.inject.Inject;
public class Main extends JavaPlugin {
    @Inject private Cmds cmds;
    @Inject private Spawns listener;

    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
        saveDefaultConfig();
        reloadConfig();

        Binder module = new Binder(this);
        Injector injector = module.createInjector();
        injector.injectMembers(this);

        this.getCommand("zombies").setExecutor(this.cmds);
        this.getServer().getPluginManager().registerEvents(this.listener, this);
        //this.getCommand("zombies").setTabCompleter(new Tab());
        //getServer().getPluginManager().registerEvents(new onSpawn(), this);
        //this.getServer().getPluginManager().registerEvents(this.onSpawn, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}