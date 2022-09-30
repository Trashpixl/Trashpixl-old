package zero.zero

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.OnCommandPvp
import zero.zero.command.OnCommandPvpBow
import zero.zero.command.OnCommandPvpSumo
import zero.zero.command.OnCommandTnt
import zero.zero.handler.Death
import zero.zero.handler.RaceTimer

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Death(this)
        RaceTimer(this)
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("Tnt")?.setExecutor(OnCommandTnt())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        //add more here
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}