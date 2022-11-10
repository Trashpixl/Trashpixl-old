package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Material//import all the material
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import zero.zero.Zero//importing the zero class
import java.io.File// importing java file class
import java.io.FileWriter// importing the file writer class
import java.io.IOException// importing the io exeption class
import java.util.*// importing the java util class

class FirstToFinish (plugin: Zero?) : Listener { // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)// geting the plugin
    }
    @EventHandler// define that the following code is an event handler
    fun pressurePlateHandler(e: PlayerInteractEvent) { //describes what the event is
        if (e.action == Action.PHYSICAL) { //check if the action is physical
            if (e.clickedBlock!!.type == Material.WARPED_PRESSURE_PLATE) { //compare what the player step on to a stone pressure plate and is required a non-nullable
                val fileName = "Minigame.txt"// creating the file name
                val actualFile = File(fileName)// creating the file
                var actualdata = 0// creating the var that hold the data of the file
                try {// trying the following code 
                    if (actualFile.exists() && actualFile.isFile) {//checking if the file exist
                        try {// trying the following code
                            val reader = Scanner(actualFile)// creting the reader
                            val data = reader.nextLine()// reading the first line
                            actualdata = data.toInt()// converting the data to int
                            reader.close()// closing the reader

                        } catch (e: IOException) {// cathcing the exeption
                            throw RuntimeException(e)// throwing it the hardest we can so it wont come back for a long time
                        }
                    }
                } catch (e: IOException) {// catching the exeption
                    throw RuntimeException(e)// throwing it 
                }
                val p = e.player //create the local player id
                if (actualdata == 4 || actualdata == 5) {// checking if the number in the file corepond to the number require to start the exeption
                    if (p.location.world.name.endsWith("world")) {// checking if the player is in the right world
                        p.sendMessage(p.name + " won the race")// sending the won message 
                        for (p2 in Bukkit.getServer().onlinePlayers) {// geting all online player
                            if (p2.location.world.name.endsWith("world")) {// checking their world
                                Bukkit.dispatchCommand(p2, "function server:tp_lobby")// tp them in the lobby 
                            }
                        }
                        try {// trying the following code
                            if (actualFile.exists() && actualFile.isFile) {// checking if the file exist
                                val dataToWrite = "0"// cretin g the var with the data to write
                                val myWriter: FileWriter //create the file writer
                                try {// trying the following code
                                    myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                                    myWriter.write(dataToWrite)//writing the data to the file
                                    myWriter.close()//closing the writer
                                } catch (e: IOException) {// catching the exeption
                                    throw java.lang.RuntimeException(e)// trowing it 
                                }
                            }
                        } catch (e: IOException) {// cathing it...
                            throw java.lang.RuntimeException(e)//throwing it the hardest we can, be gone exeption you have no friend :)
                        }
                    }
                }
            }
        }
    }
}