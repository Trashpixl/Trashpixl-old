package zero.zero

import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.event.player.PlayerTeleportEvent

//the package for this project



class OnCommandPvp (plugin: Mini?) : CommandExecutor {// creating the class death and implementing the listener
    


    


    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        var listplayer = arrayOf(Bukkit.getOnlinePlayers())
        
        var p 
        val x = 0.0
        val y = 0.0
        val z = 0.0
        var w:World = p.getWorld
        var playerCount = 1
        for(var i = 0;i > 1;i = 0){
            if (playerCount <= listplayer.lenght)
            p = listplayer[playerCount]
            //move1
            //move2
            else{
                break
            }
        }


        val to = Location(w, x, y, z)//move before for
        var from:Location = p.getLocation()//move 1
        PlayerTeleportEvent(p, from, to)//move2

        return true

    }
}