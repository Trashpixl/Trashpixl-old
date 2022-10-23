package zero.zero.handler //the package for this project


import org.bukkit.Bukkit
import org.bukkit.Bukkit.getServer
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerRespawnEvent
import zero.zero.Zero


class Respawn(plugin: Zero?) : Listener {// creating the class death and implementing the listener
// the implements for the listener
init { //the constructor of this handler
    Bukkit.getPluginManager().registerEvents(this, plugin!!)//linking it to the main code
}

    @EventHandler //says that this is an event handler
    fun onPlayerRespawn(e: PlayerRespawnEvent) {//creating the on player death event function and importing the death class

        for(p in getServer().onlinePlayers){
            Bukkit.dispatchCommand(p, "function server:tp_lobby")
            p.sendMessage("bob")

        }
    }
}

