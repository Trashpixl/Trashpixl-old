package zero.zero

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.lang.Thread.sleep

//the package for this project



class Tnt : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {

        val x = 247.0
        val y = -58.0
        val z = 250.0
        var count = 0
        var playerName = ""


        for (p in getServer().onlinePlayers) {
            //println(p.name)
            if (count == 0){
                playerName = p.name().toString()
                count++
            }
            val w: World = p.world
            val to = Location(w, x, y, z)//move before for
            p.teleport(to)


        }
        val p = getServer().getPlayer(playerName)
        p!!.sendMessage("3")
        sleep(1000)
        p.sendMessage("2")
        sleep(1000)
        p.sendMessage("1")



        return false

    }
}