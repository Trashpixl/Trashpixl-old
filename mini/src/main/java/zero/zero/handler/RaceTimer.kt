package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import zero.zero.Zero
import java.io.File
import java.io.IOException
import java.util.*


class RaceTimer (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this event
        Bukkit.getPluginManager().registerEvents(this, plugin!!)// linking it t the main code
    }

    @EventHandler
    fun pressurePlateHandler(e: PlayerInteractEvent) { //describes what the event is
        if (e.action == Action.PHYSICAL) { //check if the action is physical
            if (e.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val fileName = "Minigame.txt"
                val actualFile = File(fileName)
                var actualdata = 0
                try {
                    if (actualFile.exists() && actualFile.isFile) {
                        try {
                            val reader = Scanner(actualFile)
                            val data = reader.nextLine()
                            e.player.sendMessage(data)
                            actualdata = data.toInt()
                            reader.close()

                        } catch (e: IOException) {
                            throw RuntimeException(e)
                        }
                    }
                } catch (e: IOException) {
                    throw RuntimeException(e)
                }
                val x = 0.0// creating the x variable for player tp
                val y = 0.0// creating the y variable for player tp
                val z = 0.0// creating the z variable for player tp
                val p = e.player //create the local player id
                if (actualdata == 2) {
                    if (p.location.world.name.endsWith("overworld")) {//checking in which environment the player is
                        val name = p.name

                        p.sendMessage(name + "won the race")//bob
                        for (player in getServer().onlinePlayers) {// listing all the player in the server
                            val w: World = player.world// creating a variable to store the player world
                            val to = Location(w, x, y, z)//move before for
                            player.teleport(to)// teleporting the player


                        }
                    }


                }
            }
        }
    }
}

