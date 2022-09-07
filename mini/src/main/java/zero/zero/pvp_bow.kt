package zero.zero //the package for this project


import org.bukkit.Bukkit //importing bukkit
import org.bukkit.entity.Player // importing the player entitty
import org.bukkit.event.EventHandler //importing the event handler
import org.bukkit.event.Listener //importing the handler
import org.bukkit.event.entity.PlayerDeathEvent //importing the player death event


class pvp_bow (plugin: Mini?) : CommandExecutor {// creating the class death and impplementing the listener 
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//says that they need to import and register event
    }

    @EventHandler //says that this is an event handler
    fun onPvpBowStartup(e: PlayerDeathEvent) {//creating the on player death event function and importing the death class
        
    }
}