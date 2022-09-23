package zero.zero

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.lang.Thread.sleep

//the package for this project



class Tnt : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 247.0
        val y = -58.0
        val z = 250.0

        var playerName: Player? = null


        for (p in getServer().onlinePlayers) {
            //println(p.name)

            playerName = p
            val w: World = p.world
            val to = Location(w, x, y, z)//move before for
            p.teleport(to)


        }

        playerName!!.sendMessage("3")
        sleep(1000)
        playerName.sendMessage("2")
        sleep(1000)
        playerName.sendMessage("1")


        return false

    }
}