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
                if (ev.entity.location.world.name.endsWith("world")) {
                    if (ev.cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || ev.cause == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK ) {

                        (ev.entity as Player).health = 20.0

                    }
                    if(ev.cause == EntityDamageEvent.DamageCause.VOID){
                        (ev.entity as Player).health = 0.0
                    }
                }
            }
        }
    }
}