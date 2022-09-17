package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Mini : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("starting")
        this.getCommand("pvp")?.setExecutor(OnCommandPvp())
        this.getCommand("pvp")?.setExecutor(OnCommandPvpBow())
        this.getCommand("pvp")?.setExecutor(OnCommandPvpSumo())
        
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}