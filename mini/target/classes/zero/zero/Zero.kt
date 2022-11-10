package zero.zero// the package of this project bob

import org.bukkit.plugin.java.JavaPlugin
import zero.zero.command.*// importing all the command
import zero.zero.handler.*//importing all the handler 
import java.io.File// importing java file class for writing the file
import java.io.FileWriter// importing the file writer
import java.io.IOException// importing the io exeption class



class Zero : JavaPlugin() {
    // creating the main class
     override fun onEnable() {// plugin startup logic
        val fileName = "Minigame.txt"// creating the file name variable
        val actualFile = File(fileName)// creating the file variable

        Death(this)// init the death handler
        RaceTimer(this)// init the race timer handler
        Loot(this)// init the loot handler
        SellHandlerInventory(this)//init the sell handler 
        PlateHandler(this)// init the plate handler
        WoodPlateHandler(this)// init the wood plate handler
        Laucher(this)// init the laucher handler
        FirstToFinish(this)// init the first to finish handler
        Punch(this)// init the punch handler

        logger.info("starting the plugin")//say that it's starting the plugin

        this.getCommand("onCommandStore")?.setExecutor(OnCommandStore())// init the command for the Store 
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
        this.getCommand("onCommandBridgeRace")?.setExecutor(OnCommandBridgeRace())// init the command for the tag
        this.getCommand("onCommandLabi")?.setExecutor(OnCommandLabi())// init the command for the tag
        try {//trying the following code
            if (actualFile.exists() && actualFile.isFile) {// checking if the file exist
            } else {
                if (actualFile.createNewFile()) { //creating the new file
                    val dataToWrite = "0"// creating the data to write var
                    val myWriter: FileWriter //create the file writer
                    try {// trying the following code
                        myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                        myWriter.write(dataToWrite)//writing the data to the file
                        myWriter.close()//closing the writer
                    } catch (e: IOException) {//catching the exeption 
                        throw RuntimeException(e)// throwing it the hardest we can so it wont come back
                    }
                } else {
                    println("something went wrong while creating the file") //says that something went from while creating the file
                }
            }
        }
        catch (e: IOException) { //catching the exception
            throw RuntimeException(e) //create the actual error message
        }
    }
 override fun onDisable() {
        // Plugin shutdown logic
    }
}