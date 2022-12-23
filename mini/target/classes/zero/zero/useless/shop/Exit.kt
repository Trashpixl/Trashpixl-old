package zero.zero.useless.shop //the package for this project



import org.bukkit.Bukkit //importing bukkit
import org.bukkit.Material //importing the material librairy
import org.bukkit.event.EventHandler //importing the event handler class
import org.bukkit.event.Listener //importing the event listener
import org.bukkit.event.block.Action //importing the block action class
import org.bukkit.event.player.PlayerInteractEvent //impoting the player interacte event class
import org.bukkit.inventory.ItemStack //importing the itemstack class
import zero.zero.Zero //importing the zero class
import java.io.File //importing the file class
import java.io.FileWriter //importing the file writer class
import java.io.IOException //importing the ioexeption class
import java.util.* //importing all the java utils class


class Exit (plugin: Zero?) : Listener { //creating the class 
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) //init the plugin
    }
    @EventHandler //say that it is an event handler
    fun buttonHandler(e: PlayerInteractEvent) { //describes what the event is
        if (e.action == Action.RIGHT_CLICK_BLOCK) { //check if the action is physical
            if (e.clickedBlock!!.type == Material.BARRIER) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val fileName = "Server.txt" //creating the file name var 
                val actualFile = File(fileName) //creating the file 
                var Serv = 0 //creating the actual data var
                try { //trying the code
                    if (actualFile.exists() && actualFile.isFile) { //checking if actual file is a file 
                        try {
                            val reader = Scanner(actualFile) //creating the scanner
                            val data = reader.nextLine() //reading the first line
                            Serv = data.toInt() //converting the data to an int
                            reader.close() //closing the reader
                        } catch (e: IOException) { //catching the exeption 
                            throw RuntimeException(e) //trowing the exeption
                        }
                    }
                } catch (e: IOException) { //catching the exeption
                    throw RuntimeException(e) //trowing it again
                }
                if(Serv == 0){
                    print("exit")
               
                        
            }
        }
    }
}
}
