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
        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())// init the commanf for the pvp game 
        this.getCommand("onCommandTnt")?.setExecutor(OnCommandCaptureFlag())// init the command for capture the flag
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())// init the command for pvp bow
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())// init the command for pvp sumo
        this.getCommand("onCommandDontDie")?.setExecutor(OnCommandDontDie())// init the command for pvp dont die
        this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())// init the command for pvp knock back
        this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())// init the command for pvp loot
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())// init the command the command for pvp sumo
        this.getCommand("onCommandParkour")?.setExecutor(OnCommandParkour())// init the command for the parkour
        this.getCommand("onCommandCaptureFlag")?.setExecutor(OnCommandCaptureFlag())// init the command for capture the flag
        this.getCommand("onCommandChaiseMusical")?.setExecutor(OnCommandChaiseMusical())// init the command for chaise musical
        this.getCommand("onCommandClimbFast")?.setExecutor(OnCommandClimbFast())// init the command for climb fast
        this.getCommand("onCommandCpsTest")?.setExecutor(OnCommandCpsTest())// init the command for cps test
        this.getCommand("onCommandDodgeBall")?.setExecutor(OnCommandDodgeBall())// init the command doe the dodgeball
        this.getCommand("onCommandElytraRace")?.setExecutor(OnCommandElytraRace())//init the command for the elytre race
        this.getCommand("onCommandFallTrap")?.setExecutor(OnCommandFallTrap())// init the command for fall trap
        this.getCommand("onCommandFindMe")?.setExecutor(OnCommandFindMe())// init the command for find me
        this.getCommand("onCommandFireTrap")?.setExecutor(OnCommandFireTrap())// init the command for the fire trap
        this.getCommand("onCommandHideAndSeek")?.setExecutor(OnCommandHideAndSeek())// init the command for hide and seek
        this.getCommand("onCommandHorseRace")?.setExecutor(OnCommandHorseRace())// init tha command for the horse race
        this.getCommand("onCommandMlg")?.setExecutor(OnCommandMlg())// init the command for the mlg race
        this.getCommand("onCommandRockPaperCisor")?.setExecutor(OnCommandRockPaperCisor())// init the command for rock paper cisor
        this.getCommand("onCommandSkywars")?.setExecutor(OnCommandSkywars())// init the commad for skywars
        this.getCommand("onCommandSwimFast")?.setExecutor(OnCommandSwimFast())// init the command for swimming race
        this.getCommand("onCommandTag")?.setExecutor(OnCommandTag())// init the command for the tag
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