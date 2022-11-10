package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Material//import all the material
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import zero.zero.Zero
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*

class FirstToFinish (plugin: Zero?) : Listener { // the implements for the listener

    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }

    @EventHandler
    fun pressurePlateHandler(e: PlayerInteractEvent) { //describes what the event is

        if (e.action == Action.PHYSICAL) { //check if the action is physical
            if (e.clickedBlock!!.type == Material.WARPED_PRESSURE_PLATE) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val fileName = "Minigame.txt"
                val actualFile = File(fileName)
                var actualdata = 0
                try {
                    if (actualFile.exists() && actualFile.isFile) {
                        try {
                            val reader = Scanner(actualFile)
                            val data = reader.nextLine()
                            actualdata = data.toInt()
                            reader.close()

                        } catch (e: IOException) {
                            throw RuntimeException(e)
                        }
                    }
                } catch (e: IOException) {
                    throw RuntimeException(e)
                }
                val p = e.player //create the local player id
                if (actualdata == 4 || actualdata == 5) {
                    if (p.location.world.name.endsWith("world")) {
                        p.sendMessage(p.name + " won the race")
                        for (p2 in Bukkit.getServer().onlinePlayers) {
                            if (p2.location.world.name.endsWith("world")) {
                                Bukkit.dispatchCommand(p2, "function server:tp_lobby")
                            }
                        }
                        try {
                            if (actualFile.exists() && actualFile.isFile) {
                                val dataToWrite = "0"
                                val myWriter: FileWriter //create the file writer
                                try {
                                    myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                                    myWriter.write(dataToWrite)//writing the data to the file
                                    myWriter.close()//closing the writer
                                } catch (e: IOException) {
                                    throw java.lang.RuntimeException(e)
                                }
                            }
                        } catch (e: IOException) {
                            throw java.lang.RuntimeException(e)
                        }
                    }
                }
            }
        }
    }
}