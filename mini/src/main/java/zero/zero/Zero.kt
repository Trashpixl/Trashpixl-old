package zero.zero

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*
import zero.zero.handler.Death
import zero.zero.handler.Loot
import zero.zero.handler.RaceTimer

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        //plugin.saveDefaultConfig()
        //Config.load("config.yml")
        this.getCommand("OnCommandParkour")?.setExecutor(onCommandParkour())
        Death(this)
        RaceTimer(this)
        Loot(this)
        logger.info("starting")
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("onCommandTnt")?.setExecutor(OnCommandCaptureFlag())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandDontDie")?.setExecutor(OnCommandDontDie())
        this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())
        this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandParkour")?.setExecutor(OnCommandParkour())
        //add more here
    }
   public fun write(write:String, where:String){
       // plugin.getConfig().set(where, write)
    }
   public fun read(toRead:String){
        //val content:String = plugin.getConfig().getString(toRead)
        //return content
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}