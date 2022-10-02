package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Material//import all the material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import zero.zero.Zero


class Loot (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }
var p: Player? = null
    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.PHYSICAL) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                p = ev.player

                val kit = (1..4).random()
                if(kit == 1){
                    kit1()
                }
                else{
                    if(kit == 2){
                        kit2()
                    }
                    else{
                        if(kit == 3){
                            kit3()
                        }
                        else{
                            if(kit == 4){
                                kit4()
                            }
                            else{
                                print("something went wrong")
                            }
                        }
                    }
                }


            
        }
                }
        }
        private fun kit1(){


        }
        private fun kit2(){


        }
        private fun kit3(){


        }
        private fun kit4(){


        }
    }
