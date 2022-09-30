package zero.zero.handler //the package for this project


import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import zero.zero.Zero


class Death (plugin: Zero?): Listener {// creating the class death and implementing the listener
    // the implements for the listener
init { //the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)
}

    @EventHandler //says that this is an event handler
    fun onPlayerDead(e: PlayerDeathEvent) {//creating the on player death event function and importing the death class
        val name:String = e.player.name//name variable to store the player name
        e.player.sendMessage(name + "died an you all won this match")//send the message of who won the match 
        //Thread.sleep(10000)//waiting 10sec before tp the player
        Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby
            //some code here

        if (e.player.killer is Player) {//checking if the entity killer is player
            //some code here
            val nameKiller:String = e.player.name//name killer saving the name of the killer to display it in the chat
            e.player.sendMessage(nameKiller + "kill is team mate")// says who kill who 
            //Thread.sleep(10000)//waiting 10 sec before sending it
            //Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby

        }
        for (p in Bukkit.getServer().onlinePlayers) {
            //println(p.name)




        }
    }
}