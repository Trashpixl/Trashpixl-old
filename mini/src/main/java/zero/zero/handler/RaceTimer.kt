package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Bukkit.getServer
import org.bukkit.Location// importing everyting in the location
import org.bukkit.Material//import all the material
import org.bukkit.World// importing everything about world
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import zero.zero.Zero// importing the main class
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*


class RaceTimer (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this event
        Bukkit.getPluginManager().registerEvents(this, plugin!!)// linking it t the main code
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.PHYSICAL) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val fileName = "game.txt"// creating the file name
                val toWrite = "0"
                val actualFile = File(fileName)
                if(actualFile.exists() && actualFile.isFile){
                    val reader = Scanner(actualFile)
                    val data = reader.nextLine()
                    val dataInt = data.toInt()
                    if(dataInt == 3){
                        val x = 0.0// creating the x variable for player tp
                        val y = 0.0// creating the y variable for player tp
                        val z = 0.0// creating the z variable for player tp
                        val p = ev.player //create the local player id
                        if(p.location.world.name.endsWith("overworld")){//checking in wich environment the player is
                            val name = p.name//test cccalebbbooooubbbouuu

                            p.sendMessage(name + "won the race")//bob
                            for (player in getServer().onlinePlayers) {// listing all the player in the server
                                val w: World = player.world// creating a variable to store the player world
                                val to = Location(w, x, y, z)//move before for
                                player.teleport(to)// teleporting the palyer



                            }
                        }

                        try{
                            val myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                            myWriter.write(toWrite)//writing the data to the file
                            myWriter.close()//closing the writer
                        }
                        catch(e: IOException){
                            throw RuntimeException(e)
                        }


                    }
                }
            }
        }
    }
}