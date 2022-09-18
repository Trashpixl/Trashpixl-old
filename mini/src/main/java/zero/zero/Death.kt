package zero.zero //the package for this project


import org.bukkit.Bukkit //importing bukkit
import org.bukkit.entity.Player // importing the player entitty
import org.bukkit.event.EventHandler //importing the event handler
import org.bukkit.event.Listener //importing the handler
import org.bukkit.event.entity.PlayerDeathEvent //importing the player death event


class Death (plugin: Zero?) : Listener {// creating the class death and impplementing the listener
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//says that they need to import and register event
    }

    @EventHandler //says that this is an event handler
    fun onPlayerDead(e: PlayerDeathEvent) {//creating the on player death event function and importing the death class
        val name:String = e.player.name//name variable to store the player name
        e.player.sendMessage(name + "died an you all won this match")//send the message of who won the match 
        Thread.sleep(10000)//waiting 10sec before tp the player
        Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby
            //some code here

        if (e.entity.killer is Player) {//checking if the entity killer is player
            //some code here
            val nameKiller:String = e.player.name//name killer saving the name of the killer to display it in the chat
            e.player.sendMessage(nameKiller + "kill is team mate")// says who kill who 
            Thread.sleep(10000)//waiting 10 sec before sending it
            Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby

        }
    }
}