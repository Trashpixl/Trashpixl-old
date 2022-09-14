package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Mini : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("starting")
        this.getCommand("bow").setExecutor(new OnCommandPvp());
        
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}