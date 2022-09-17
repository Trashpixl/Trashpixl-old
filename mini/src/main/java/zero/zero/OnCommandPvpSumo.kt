package zero.zero

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.event.player.PlayerTeleportEvent

//the package for this project



class OnCommandPvpSumo : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 0.0
        val y = 0.0
        val z = 0.0

        for (p in getServer().onlinePlayers) {
            val w: World = p.world
            val to = Location(w, x, y, z)//move before for
            val from: Location = p.location//move 1
            PlayerTeleportEvent(p, from, to)//move2


            
        }

        return true

    }
}