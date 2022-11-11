package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.entity.EntityDamageEvent
import zero.zero.Zero
import java.io.File
import java.io.IOException
import java.util.*

class Punch (plugin: Zero?) : Listener { // the implements for the listener

    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }

    @EventHandler
    fun pressurePlateHandler(ev: EntityDamageByEntityEvent) { //describes what the event is
        val fileName = "Minigame.txt"
        val actualFile = File(fileName)
        var actualdata = 0
        try {
            if (actualFile.exists() && actualFile.isFile) {
                try {
                    val reader = Scanner(actualFile)
                    val data = reader.nextLine()
                    actualdata = data.toInt()
                    //System.out.println(data_final_string);
                    reader.close()

                } catch (e: IOException) {
                    throw RuntimeException(e)
                }
            }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }

        if (actualdata == 6) {
            if (ev.entity is Player) {
                if (ev.entity.location.world.name.endsWith("world")) {//check if the player is in the right world
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK ) {//check if the damage is cause by an entity attack or sweep attack
                        (ev.entity as Player).health = 20.0//set the player health to 20

                    }
                    if(ev.cause == EntityDamageEvent.DamageCause.VOID){//check if the damage is cause by the void
                        (ev.entity as Player).health = 0.0//set the player health to 0
                    }
                }
            }
        }
    }
}