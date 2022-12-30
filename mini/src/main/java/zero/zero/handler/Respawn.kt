package zero.zero.handler

import zero.zero.Zero //the package for this project
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import java.io.IOException
import java.io.File
import java.util.Scanner
import com.google.common.io.ByteStreams
class Respawn(plugin: Zero?, main:JavaPlugin) : Listener { //creating the class death and implementing the listener
    val mainPlugin = main
    //the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) //linking it to the main code
    }
    @EventHandler //says that this is an event handler
    fun onPlayerRespawn(e: PlayerRespawnEvent) {
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
                if(Serv == 1){
                    //add here the code for teh lobby spawn point
                    
                }
    }
}