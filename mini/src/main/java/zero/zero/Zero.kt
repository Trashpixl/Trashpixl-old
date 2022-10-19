package zero.zero// the package of this project bob

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*// importing all the command
import zero.zero.handler.*
import java.io.File


class Zero : JavaPlugin() {// creating the main class
    override fun onEnable() {// plugin startup logic

        //plugin.saveDefaultConfig()
        //Config.load("config.yml")
        Death(this)// init the death handler
        RaceTimer(this)// init the race timer handler
        Loot(this)// init the loot handler
        SellHandlerInventory(this)
        PlateHandler(this)
        WoodPlateHandler(this)
        Laucher(this)
        logger.info("starting bob")//say that its starting the plugin
        
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
        val fileName = "game.txt"// creating the file name 
        val actualFile = File(fileName)
    if (actualFile.exists() && actualFile.isFile) {
        print("file is already present")
    }
    else{
        if (actualFile.createNewFile()) {
            print("file created!")
        }
        else{
            print("fail to create the file")
        }
    }
        //add more here
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}