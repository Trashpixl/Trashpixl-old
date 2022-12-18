package zero.zero.handler //the package for this project


import org.bukkit.Bukkit //importing bukkit
import org.bukkit.Bukkit.getServer //importing the get server class
import org.bukkit.entity.Player //importing the player enttity
import org.bukkit.event.EventHandler //importing the event handler
import org.bukkit.event.Listener //impoting the litsener
import org.bukkit.event.entity.PlayerDeathEvent //importing the player death event
import org.bukkit.plugin.java.JavaPlugin
import zero.zero.Zero //impoting the whole package
import java.io.File //importing the java file var
import java.io.FileWriter //importing the filewriter
import java.io.IOException //imprting the io exeption
import java.util.* //importing all the java util class
import com.google.common.io.ByteStreams


class Death(plugin: Zero?, main:JavaPlugin) : Listener { //creating the class death and implementing the listener
    val mainPlugin = main
 //the implements for the listener
init { //the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!) //linking it to the main code
}
    @EventHandler //says that this is an event handler
    fun onPlayerDead(e: PlayerDeathEvent) { //creating the on player death event function and importing the death class
        val fileName = "Minigame.txt" //creating the file name var 
        val actualFile = File(fileName) //creating the file 
        var actualdata = 0 //creating the actual data var
        try { //trying the code
            if (actualFile.exists() && actualFile.isFile) { //checking if actual file is a file 
                try {
                    val reader = Scanner(actualFile) //creating the scanner
                    val data = reader.nextLine() //reading the first line
                    actualdata = data.toInt() //converting the data to an int
                    reader.close() //closing the reader
                } catch (e: IOException) { //catching the exeption 
                    throw RuntimeException(e) //trowing the exeption
                }
            }
        } catch (e: IOException) { //catching the exeption
            throw RuntimeException(e) //trowing it again
        }
        if (actualdata == 1 || actualdata == 5 || actualdata == 3 || actualdata == 6) { //check if the data that we found corespound to the one reqiere to start the hamdler
            val name: String = e.player.name //name variable to store the player name
            val fileName2 = "Server.txt" //creating the file name var 
                val actualFile2 = File(fileName2) //creating the file 
                var Serv = 0 //creating the actual data var
                try { //trying the code
                    if (actualFile2.exists() && actualFile2.isFile) { //checking if actual file is a file 
                        try {
                            val reader2 = Scanner(actualFile2) //creating the scanner
                            val data2 = reader2.nextLine() //reading the first line
                            Serv = data2.toInt() //converting the data to an int
                            reader2.close() //closing the reader
                        } catch (e: IOException) { //catching the exeption 
                            throw RuntimeException(e) //trowing the exeption
                        }
                    }
                } catch (e: IOException) { //catching the exeption
                    throw RuntimeException(e) //trowing it again
                }
                if(Serv == 0){
                e.player.sendMessage("$name  died an you all won this match") //send the message of who won the match
                if (e.player.killer is Player) { //checking if the entity killer is player
                    val nameKiller: String = e.player.name //name killer saving the name of the killer to display it in the chat
                    e.player.sendMessage(nameKiller + "kill is team mate") //says who kill who
                }
                try { //trying the code
                    if (actualFile.exists() && actualFile.isFile) { //checking if the file exist
                        val dataToWrite = "0" //creating the data to write var
                        val myWriter: FileWriter //create the file writer
                        try { //trying the code
                            myWriter = FileWriter(actualFile) //pointing the writer to the actual file
                            myWriter.write(dataToWrite) //writing the data to the file
                            myWriter.close() //closing the writer
                        } catch (e: IOException) { //catching the exeption
                            throw RuntimeException(e) //trowing the exeption
                        }
                    }
                } catch (e: IOException) { //catching the exeption
                    throw RuntimeException(e) //throwing the exeption 
                }
                for (p in getServer().onlinePlayers) { //geting all the player in the server
                   
                        //Bukkit.dispatchCommand(p, "server lobby") //if they are in the right world tp them in the lobby
                        val out = ByteStreams.newDataOutput()
                        out.writeUTF("Connect")
                        out.writeUTF("mini")
                        p.sendPluginMessage(mainPlugin, "BungeeCord", out.toByteArray())
                    
                }

            }
        }
    }
}
