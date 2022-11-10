package zero.zero.handler //the package for this project


import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import zero.zero.Zero
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*


class Death(plugin: Zero?) : Listener {// creating the class death and implementing the listener
// the implements for the listener
init { //the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//linking it to the main code
}

    @EventHandler //says that this is an event handler
    fun onPlayerDead(e: PlayerDeathEvent) {//creating the on player death event function and importing the death class
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

        if (actualdata == 1 || actualdata == 5 || actualdata == 3) {
            val name: String = e.player.name//name variable to store the player name

            if (e.player.location.world.name.endsWith("world")) {


                e.player.sendMessage("$name  died an you all won this match")//send the message of who won the match
                if (e.player.killer is Player) {//checking if the entity killer is player
                    //some code here
                    val nameKiller: String =
                        e.player.name//name killer saving the name of the killer to display it in the chat
                    e.player.sendMessage(nameKiller + "kill is team mate")// says who kill who

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
                for (p in getServer().onlinePlayers) {
                    if (p.location.world.name.endsWith("world")) {
                        Bukkit.dispatchCommand(p, "function server:tp_lobby")
                    }
                }

            }
        }
    }
}
