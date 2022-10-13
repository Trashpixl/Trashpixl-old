package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.Material//import all the material
import org.bukkit.World
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import zero.zero.Zero


class RaceTimer (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.PHYSICAL) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_PRESSURE_PLATE) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val x = 0.0
                val y = 0.0
                val z = 0.0
                val p = ev.player //create the local player id
                if(p.world.environment == World.Environment.NORMAL){
                val name = p.name//test cccalebbbooooubbbouuu
                
                p.sendMessage(name + "won the race")//bob
                for (player in getServer().onlinePlayers) {
                    val w: World = player.world
                    val to = Location(w, x, y, z)//move before for
                    player.teleport(to)


            
        }
                }
                



            }
        }
    }
}