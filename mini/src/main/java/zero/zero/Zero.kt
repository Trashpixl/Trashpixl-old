package zero.zero

import org.bukkit.plugin.java.JavaPlugin

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Death(this)
        RaceTimer(this)
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("Tnt")?.setExecutor(onCommandTnt())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        //add more here
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}