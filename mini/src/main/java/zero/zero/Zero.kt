package zero.zero

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*
import zero.zero.handler.Death
import zero.zero.handler.Loot
import zero.zero.handler.RaceTimer

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Death(this)
        RaceTimer(this)
        Loot(this)
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("onCommandTnt")?.setExecutor(OnCommandTnt())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandDontDie")?.setExecutor(OnCommandDontDie())
        this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())
        this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandBridge")?.setExecutor(OnCommandBridge())
        //add more here
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}