package zero.zero//the package for this project


import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent


class Death (plugin: Mini?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }

    @EventHandler
    fun onPlayerDead(e: PlayerDeathEvent) {
        val name:String = e.player.name//name variable to store the player name
        e.player.sendMessage(name + "died an you all won this match")
        Thread.sleep(10000)//waiting 10sec before tp the player
        Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby
            //some code here

        if (e.entity.killer is Player) {//checking if the entity killer is player
            //some code here
            val nameKiller:String = e.player.name//namekiller saving the name of the killer to display it in the chat
            e.player.sendMessage(nameKiller + "kill is team mate")
            Thread.sleep(10000)//waiting 10 sec before sending it
            Bukkit.dispatchCommand(e.player, "/server lobby")//sending the player to the lobby

        }
    }
}