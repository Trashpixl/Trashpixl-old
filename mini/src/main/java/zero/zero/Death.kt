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
        val name:String = e.player.name
        e.player.sendMessage(name + "died an you all won this match")
        Thread.sleep(10000)
        Bukkit.dispatchCommand(e.player, "/server lobby")
            //some code here

        if (e.entity.killer is Player) {
            //some code here
            val nameKiller:String = e.player.name
            e.player.sendMessage(nameKiller + "kill is team mate")
            Thread.sleep(10000)
            Bukkit.dispatchCommand(e.player, "/server lobby")

        }
    }
}