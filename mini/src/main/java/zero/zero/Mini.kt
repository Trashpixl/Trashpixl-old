package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Mini : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("starting")
        PlateHandler(this) //create the plate handler
        Death(this) //create the plate handler
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}