package zero.zero.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import java.io.File
import java.io.FileWriter
import java.io.IOException

//the package for this project



class OnCommandPvp : CommandExecutor {// creating the class death and implementing the listener






    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val fileName = "game.txt"// creating the file name
        val toWrite = "1"
        val actualFile = File(fileName)
        val x = 239.0
        val y = -58.0
        val z = 279.0

        for (p in getServer().onlinePlayers) {
            if(p.location.world.name.endsWith("lobby")){
            p.health = 20.0
            val w: World = p.world
            val to = Location(w, x, y, z)//move before for
            val item = ItemStack(Material.IRON_SWORD, 1)
            p.teleport(to)
            p.inventory.clear()
            p.inventory.setItemInMainHand(item)
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

        return false

    }
}