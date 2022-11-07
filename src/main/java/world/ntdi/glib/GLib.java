package world.ntdi.glib;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GLib extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static GLib getInstance() {
        return (GLib) Bukkit.getServer().getPluginManager().getPlugin("GLib");
    }
}
