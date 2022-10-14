package zero.zero

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*
import zero.zero.handler.Death
import zero.zero.handler.Loot
import zero.zero.handler.RaceTimer
import java.io.ObjectInputFilter

class Zero : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        //plugin.saveDefaultConfig()
        //Config.load("config.yml")
        Death(this)
        RaceTimer(this)
        Loot(this)
        logger.info("starting")//say that its starting the plugin
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())
        this.getCommand("onCommandTnt")?.setExecutor(OnCommandCaptureFlag())
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandDontDie")?.setExecutor(OnCommandDontDie())
        this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())
        this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())
        this.getCommand("onCommandParkour")?.setExecutor(OnCommandParkour())
        this.getCommand("onCommandCaptureFlag")?.setExecutor(OnCommandCaptureFlag())
        this.getCommand("onCommandChaiseMusical")?.setExecutor(OnCommandChaiseMusical())
        this.getCommand("onCommandClimbFast")?.setExecutor(OnCommandClimbFast())
        this.getCommand("onCommandCpsTest")?.setExecutor(OnCommandCpsTest())
        this.getCommand("onCommandDodgeBall")?.setExecutor(OnCommandDodgeBall())
        this.getCommand("onCommandElytraRace")?.setExecutor(OnCommandElytraRace())
        this.getCommand("onCommandFallTrap")?.setExecutor(OnCommandFallTrap())
        this.getCommand("onCommandFindMe")?.setExecutor(OnCommandFindMe())
        this.getCommand("onCommandFireTrap")?.setExecutor(OnCommandFireTrap())
        this.getCommand("onCommandHideAndSeek")?.setExecutor(OnCommandHideAndSeek())
        this.getCommand("onCommandHorseRace")?.setExecutor(OnCommandHorseRace())
        this.getCommand("onCommandMlg")?.setExecutor(OnCommandMlg())
        this.getCommand("onCommandRockPaperCisor")?.setExecutor(OnCommandRockPaperCisor())
        this.getCommand("onCommandSkywars")?.setExecutor(OnCommandSkywars())
        this.getCommand("onCommandSwimFast")?.setExecutor(OnCommandSwimFast())
        this.getCommand("onCommandTag")?.setExecutor(OnCommandTag())
        //add more here
    }
   public fun write(write:String, where:String){
       //plugin.getConfig().set(where, write)
    }
   public fun read(toRead:String){
        //val content:String = plugin.getConfig().getString(toRead)
        //return content
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}