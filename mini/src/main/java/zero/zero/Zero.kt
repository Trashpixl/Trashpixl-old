package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("Tnt")?.setExecutor(Tnt())
        //this.getCommand("pvp")?.setExecutor(OnCommandPvpBow())
       // this.getCommand("pvp")?.setExecutor(OnCommandPvpSumo())
        
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}