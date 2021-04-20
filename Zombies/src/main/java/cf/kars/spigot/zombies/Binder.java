package cf.kars.spigot.zombies;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
public class Binder extends AbstractModule {
    private final Main plugin;

    public Binder(Main plugin) {
        this.plugin = plugin;
    }
    public Injector createInjector() {
        return Guice.createInjector(this);
    }
    @Override
    protected void configure() {
        // Here we tell Guice to use our plugin instance everytime we need it
        this.bind(Main.class).toInstance(this.plugin);
    }
}