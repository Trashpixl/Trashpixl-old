package zero.zero// the package of this project bob

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*// importing all the command
import zero.zero.handler.*
import java.io.File
import java.io.FileWriter
import java.io.IOException



class Zero : JavaPlugin() {
    // creating the main class

    override fun onEnable() {// plugin startup logic
        val fileName = "Minigame.txt"
        val actualFile = File(fileName)

        Death(this)// init the death handler
        RaceTimer(this)// init the race timer handler
        Loot(this)// init the loot handler
        SellHandlerInventory(this)
        PlateHandler(this)
        WoodPlateHandler(this)
        Laucher(this)
        FirstToFinish(this)
        Punch(this)

        logger.info("starting the plugin")//say that it's starting the plugin

        this.getCommand("onCommandPvp")?.setExecutor(OnCommandPvp())// init the command for the pvp game
        this.getCommand("onCommandTnt")?.setExecutor(OnCommandTnt())// init the command for capture the flag
        this.getCommand("onCommandPvpBow")?.setExecutor(OnCommandPvpBow())// init the command for pvp bow
        this.getCommand("onCommandPvpSumo")?.setExecutor(OnCommandPvpSumo())// init the command for pvp sumo
        this.getCommand("onCommandDontDie")?.setExecutor(OnCommandDontDie())// init the command for pvp don't die
        this.getCommand("onCommandPvpKnockBack")?.setExecutor(OnCommandPvpKnockBack())// init the command for pvp knock back
        this.getCommand("onCommandPvpLoot")?.setExecutor(OnCommandPvpLoot())// init the command for pvp loot
        this.getCommand("onCommandParkour")?.setExecutor(OnCommandParkour())// init the command for the parkour
        this.getCommand("onCommandChaiseMusical")?.setExecutor(OnCommandChaiseMusical())// init the command for chaise musical
        this.getCommand("onCommandClimbFast")?.setExecutor(OnCommandClimbFast())// init the command for climb fast
        this.getCommand("onCommandCpsTest")?.setExecutor(OnCommandCpsTest())// init the command for cps test
        this.getCommand("onCommandDodgeBall")?.setExecutor(OnCommandDodgeBall())// init the command doe the dodge-ball
        this.getCommand("onCommandElytraRace")?.setExecutor(OnCommandElytraRace())//init the command for the elytra race
        this.getCommand("onCommandFallTrap")?.setExecutor(OnCommandFallTrap())// init the command for fall trap
        this.getCommand("onCommandFindMe")?.setExecutor(OnCommandFindMe())// init the command for find me
        this.getCommand("onCommandFireTrap")?.setExecutor(OnCommandFireTrap())// init the command for the firetrap
        this.getCommand("onCommandHideAndSeek")?.setExecutor(OnCommandHideAndSeek())// init the command for hide and seek
        this.getCommand("onCommandHorseRace")?.setExecutor(OnCommandHorseRace())// init tha command for the horse race
        this.getCommand("onCommandMlg")?.setExecutor(OnCommandMlg())// init the command for the mlg race
        this.getCommand("onCommandRockPaperCisor")?.setExecutor(OnCommandRockPaperCisor())// init the command for rock paper scissor
        this.getCommand("onCommandSkywars")?.setExecutor(OnCommandSkywars())// init the command for sky-wars
        this.getCommand("onCommandSwimFast")?.setExecutor(OnCommandSwimFast())// init the command for swimming race
        this.getCommand("onCommandTag")?.setExecutor(OnCommandTag())// init the command for the tag

       
        try {
            if (actualFile.exists() && actualFile.isFile) {
            } else {
                if (actualFile.createNewFile()) { //creating the new file
                    val dataToWrite = "0"
                    val myWriter: FileWriter //create the file writer
                    try {
                        myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                        myWriter.write(dataToWrite)//writing the data to the file
                        myWriter.close()//closing the writer
                    } catch (e: IOException) {
                        throw RuntimeException(e)
                    }

                } else {
                    println("something went wrong while creating the file") //says that something went from while creating the file
                }
            }
        }
        catch (e: IOException) { //catching the exception
            println("something went wrong while creating the file from io") //says that something went from while creating the file but from io
            throw RuntimeException(e) //create the actual error message
        }
    }


    override fun onDisable() {
        // Plugin shutdown logic
    }


}