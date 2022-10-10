
package zero.zero.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

//the package for this project



class OnCommandTnt : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 247.0
        val y = -58.0
        val z = 250.0

        var p: Player?


        for (playerName in getServer().onlinePlayers) {
            //println(p.name)

            p = playerName
            p.location.world.setPvp(false)
            val w: World = p.world
            val to = Location(w, x, y, z)//move before for
            p.teleport(to)
            p.inventory.clear()

        }




        return false

    }
}