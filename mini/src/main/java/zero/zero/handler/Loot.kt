package zero.zero.handler//the package for this project


import org.bukkit.Bukkit//import all the other class
import org.bukkit.Material//import all the material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler//import the event handler
import org.bukkit.event.Listener//import all the listener
import org.bukkit.event.block.Action//import the action related to the block
import org.bukkit.event.player.PlayerInteractEvent//import the action related to the player
import org.bukkit.inventory.ItemStack
import zero.zero.Zero


class Loot (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler 
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }


    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.PHYSICAL) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
             val p = ev.p
             
              if(p.world is minecraft:overworld){
                


                val kit = (1..6).random()
                if(kit == 1){
                    val item1 = ItemStack(Material.IRON_SWORD, 1)
                    val item2 = ItemStack(Material.GOLDEN_APPLE, (1..64).random())
                    p.inventory.setItem((1..36).random(), item1)
                    p.inventory.setItem((1..36).random(), item2)

                }
                else{
                    if(kit == 2){
                        val item1 = ItemStack(Material.DIAMOND_CHESTPLATE, 1)
                        val item2 = ItemStack(Material.BREAD, (1..64).random())
                        p.inventory.setItem((1..36).random(), item1)
                        p.inventory.setItem((1..36).random(), item2)

                    }
                    else{
                        if(kit == 3){
                            val item1 = ItemStack(Material.WOODEN_AXE)
                            val item2 = ItemStack(Material.LEATHER_BOOTS)
                            p.inventory.setItem((1..36).random(), item1)
                            p.inventory.setItem((1..36).random(), item2)
                        }
                        else{
                            if(kit == 4){
                                val item1 = ItemStack(Material.GOLDEN_CHESTPLATE)
                                val item2 = ItemStack(Material.WOODEN_SWORD)
                                p.inventory.setItem((1..36).random(), item1)
                                p.inventory.setItem((1..36).random(), item2)
                            }
                            else{
                                if(kit == 5){
                                    val item1 = ItemStack(Material.IRON_BOOTS)
                                    val item2 = ItemStack(Material.LEATHER_HELMET)
                                    p.inventory.setItem((1..36).random(), item1)
                                    p.inventory.setItem((1..36).random(), item2)
                                }
                                else{
                                if(kit == 6){
                                    val item1 = ItemStack(Material.CHAINMAIL_LEGGINGS)
                                    val item2 = ItemStack(Material.STICK)
                                    p.inventory.setItem((1..36).random(), item1)
                                    p.inventory.setItem((1..36).random(), item2)
                                }
                                    else{
                                    print("ew")
                                }
                                }
                            }
                        }
                    }
                }


            
        }
                }
        }
        }





    }
