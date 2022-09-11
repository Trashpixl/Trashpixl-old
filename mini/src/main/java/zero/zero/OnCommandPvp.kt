package zero.zero

import org.bukkit.Location
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

//the package for this project



class OnCommandPvp (plugin: Mini?) : CommandExecutor {// creating the class death and impplementing the listener 
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {


        val x = 0.0
        val y = 0.0
        val z = 0.0


        var to = Location(w, x, y, z)
        //PlayerTeleportEvent(Player , Location 0, Location to)


    }
}