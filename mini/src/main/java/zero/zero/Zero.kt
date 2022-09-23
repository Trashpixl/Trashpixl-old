package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Death(this)
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("Tnt")?.setExecutor(Tnt())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}