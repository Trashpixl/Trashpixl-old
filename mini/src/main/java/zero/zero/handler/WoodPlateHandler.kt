package zero.zero.handler//the package for this project

//the import for this project
import org.bukkit.Bukkit//import bukkit for reference
import org.bukkit.Location
import org.bukkit.Material//import all the bukkit material
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import the listener class
import org.bukkit.event.block.Action//import all the action for block
import org.bukkit.event.player.PlayerInteractEvent//import the player event
import zero.zero.Zero

class WoodPlateHandler(plugin: Zero?) : Listener {//create the class and implement the listener

    init { //the constructor for the handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) //says that this need the plugin base model
    }

    @EventHandler //define that the methode is an event handler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { //create the function with the argument the player event
        if (ev.action == Action.PHYSICAL) { //check if the action is physical like step on or software like open the inventory
            if (ev.clickedBlock!!.type   == Material.OAK_PRESSURE_PLATE) { //compare the event to an oak pressure plate
                val p = ev.player //create the local variable player
                if(p.location.world.name.endsWith("main_server")){
                    //cacacacacaclelelelelellelelebobobobobobo put it here
                    var to: Location = p.bedSpawnLocation!!

                    p.teleport(to)
                }
            }
        }
    }
}