package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.Material
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
    fun buttonHandler(e: PlayerInteractEvent) { //describes what the event is
        if (e.action == Action.LEFT_CLICK_BLOCK) { //check if the action is physical
            if (e.clickedBlock!!.type == Material.STONE_BUTTON) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
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

                if (actualdata == 3) {
                    val p = e.player

                    if (p.location.world.name.endsWith("world")) {


                        val kit = (1..6).random()
                        if (kit == 1) {
                            val item1 = ItemStack(Material.IRON_SWORD, 1)
                            val item2 = ItemStack(Material.GOLDEN_APPLE, (1..64).random())
                            p.inventory.setItem((1..36).random(), item1)
                            p.inventory.setItem((1..36).random(), item2)

                        } else {
                            if (kit == 2) {
                                val item1 = ItemStack(Material.DIAMOND_CHESTPLATE, 1)
                                val item2 = ItemStack(Material.BREAD, (1..64).random())
                                p.inventory.setItem((1..36).random(), item1)
                                p.inventory.setItem((1..36).random(), item2)

                            } else {
                                if (kit == 3) {
                                    val item1 = ItemStack(Material.WOODEN_AXE)
                                    val item2 = ItemStack(Material.LEATHER_BOOTS)
                                    p.inventory.setItem((1..36).random(), item1)
                                    p.inventory.setItem((1..36).random(), item2)
                                } else {
                                    if (kit == 4) {
                                        val item1 = ItemStack(Material.GOLDEN_CHESTPLATE)
                                        val item2 = ItemStack(Material.WOODEN_SWORD)
                                        p.inventory.setItem((1..36).random(), item1)
                                        p.inventory.setItem((1..36).random(), item2)
                                    } else {
                                        if (kit == 5) {
                                            val item1 = ItemStack(Material.IRON_BOOTS)
                                            val item2 = ItemStack(Material.LEATHER_HELMET)
                                            p.inventory.setItem((1..36).random(), item1)
                                            p.inventory.setItem((1..36).random(), item2)
                                        } else {
                                            if (kit == 6) {
                                                val item1 = ItemStack(Material.CHAINMAIL_LEGGINGS)
                                                val item2 = ItemStack(Material.STICK)
                                                p.inventory.setItem((1..36).random(), item1)
                                                p.inventory.setItem((1..36).random(), item2)
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }

                    try{
                        if(actualFile.exists() && actualFile.isFile){
                            val dataToWrite = "0"
                            val myWriter: FileWriter //create the file writer
                            try {
                                myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                                myWriter.write(dataToWrite)//writing the data to the file
                                myWriter.close()//closing the writer
                            } catch (e: IOException) {
                                throw java.lang.RuntimeException(e)
                            }
                        }
                    }
                    catch(e: IOException){
                        throw java.lang.RuntimeException(e)
                    }
                }
            }
        }
    }
}
