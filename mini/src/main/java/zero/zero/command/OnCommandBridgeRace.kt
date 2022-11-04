
package zero.zero.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack

//the package for this project



class OnCommandBridgeRace : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 177.7
        val y = -60.0
        val z = 265.3

        

        for (p in getServer().onlinePlayers) {
            //println(p.name)
            if(p.location.world.name.endsWith("world")){
                val item1 = ItemStack(Material.BLACK_WOOL, 64)
                p.health = 20.0
                val w: World = p.world
                val to = Location(w, x, y, z)//move before for
                p.teleport(to)
                p.inventory.clear()
                p.inventory.setItem(1, item1)
            }
        }




        return false

    }
}