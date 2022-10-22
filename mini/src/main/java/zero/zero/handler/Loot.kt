package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import zero.zero.Zero
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.*


class Loot (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)
    }


    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.LEFT_CLICK_BLOCK) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.STONE_BUTTON) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                val fileName = "game.txt"// creating the file name
                val toWrite = "0"
                val actualFile = File(fileName)
                if(actualFile.exists() && actualFile.isFile){
                    val reader = Scanner(actualFile)
                    val data = reader.nextLine()
                    val dataInt = data.toInt()
                    if(dataInt == 2){

                        val p = ev.player

                        if(p.location.world.name.endsWith("overworld")){



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

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try{
                            val myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                            myWriter.write(toWrite)//writing the data to the file
                            myWriter.close()//closing the writer
                        }
                        catch(e: IOException){
                            throw RuntimeException(e)
                        }
                    }
                }
            }
        }
    }
}
