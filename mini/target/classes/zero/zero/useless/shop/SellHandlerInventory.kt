package zero.zero.useless.shop //the package for this project

//the import for this project

import org.bukkit.Bukkit //import for the bukkit plugin base model
import org.bukkit.Material //import all the material
import org.bukkit.event.EventHandler //import the event handler
import org.bukkit.event.Listener //import the listener
import org.bukkit.event.block.Action //import all the possible action
import org.bukkit.event.player.PlayerInteractEvent //import the interaction for the player
import org.bukkit.inventory.Inventory //import everything about the inventory
import org.bukkit.inventory.ItemStack //import everything about the item stack
import zero.zero.Zero //import zero
import java.io.* //import the io exception and writer
import java.util.* //import java file scanner
class SellHandlerInventory(plugin: Zero?) : Listener {
    //the implement for the listener
    init { //the constructor for this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!) //says that they need the plugin base model
    }

    @EventHandler //define that it's an event handler
    fun pressurePlateHandler(ev: PlayerInteractEvent) { //describe what event he is looking for
        var index = 0 //define witch inventory slot to look for stuff
        val p = ev.player //create the variable player
        val inv: Inventory = p.inventory //create a shortcut for the inventory
        var item: ItemStack? //create the variable item ad assign it to the inventory slot index
        val name = p.name //get the name of the player
        var howMany = 0 //save how many item there is in the inventory
        val fileName = "$name.txt"//create file name
        val actualFile = File(fileName)//create the file
        if (ev.action == Action.PHYSICAL) { //check if the action is physical
            if (ev.clickedBlock!!.type == Material.BIRCH_PRESSURE_PLATE) { //check the material of what the player step on
                val fileName2 = "Server.txt"// creating the file name var 
                val actualFile2 = File(fileName2)// creating the file 
                var Serv = 0// creating the actual data var
                try {// trying the code
                    if (actualFile2.exists() && actualFile2.isFile) {//checking if actual file is a file 
                        try {
                            val reader2 = Scanner(actualFile2)//creating the scanner
                            val data2 = reader2.nextLine()// reading the first line
                            Serv = data2.toInt()// converting the data to an int
                            reader2.close()// closing the reader
                        } catch (e: IOException) {// catching the exeption 
                            throw RuntimeException(e)// trowing the exeption
                        }
                    }
                } catch (e: IOException) {// catching the exeption
                    throw RuntimeException(e)// trowing it again
                }
                if(Serv == 0){
                    while (index < 36) { //repeat for all the inventory slot
                        item = inv.getItem(index)
                        if (item != null) { //check if there is an item
                            if (Objects.requireNonNull(item).type == Material.EMERALD||
                                    Objects.requireNonNull(item).type == Material.DIAMOND ||
                                    Objects.requireNonNull(item).type == Material.GOLD_INGOT ||
                                    Objects.requireNonNull(item).type == Material.REDSTONE_BLOCK ||
                                    Objects.requireNonNull(item).type == Material.COPPER_BLOCK ||
                                    Objects.requireNonNull(item).type == Material.IRON_INGOT ||
                                    Objects.requireNonNull(item).type == Material.LAPIS_BLOCK) { //check if its emerald require to be not null
                                howMany += item.amount*2 //save how many item there is in the item stack
                                        p.inventory.setItem(index, null) //reset the player inventory at a given slot
                            }
                            else{
                                if(Objects.requireNonNull(item).type == Material.AIR ||//removing all air material
                                        Objects.requireNonNull(item).type == Material.CAVE_AIR ||//removing cave air material
                                        Objects.requireNonNull(item).type == Material.VOID_AIR){//removing void air material

                                    p.inventory.setItem(index, null) //reset the player inventory at a given slot
                                }
                                else{
                                    if(Objects.requireNonNull(item).type == Material.DIAMOND_PICKAXE ||//adding pickaxe, axe, sword, armor,shovel ect to the list of thing to not remove from the inventory
                                            Objects.requireNonNull(item).type == Material.GOLDEN_PICKAXE ||
                                            Objects.requireNonNull(item).type == Material.IRON_PICKAXE ||
                                            Objects.requireNonNull(item).type == Material.STONE_PICKAXE ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_PICKAXE ||
                                            Objects.requireNonNull(item).type == Material.WOODEN_PICKAXE ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_AXE ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_AXE ||
                                            Objects.requireNonNull(item).type == Material.IRON_AXE ||
                                            Objects.requireNonNull(item).type == Material.STONE_AXE ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_AXE ||
                                            Objects.requireNonNull(item).type == Material.WOODEN_AXE ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.IRON_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.STONE_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.WOODEN_SHOVEL ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_HOE ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_HOE ||
                                            Objects.requireNonNull(item).type == Material.IRON_HOE ||
                                            Objects.requireNonNull(item).type == Material.STONE_HOE ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_HOE ||
                                            Objects.requireNonNull(item).type == Material.WOODEN_HOE ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_HELMET ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_HELMET ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.IRON_HELMET ||
                                            Objects.requireNonNull(item).type == Material.IRON_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.IRON_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.IRON_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.CHAINMAIL_HELMET ||
                                            Objects.requireNonNull(item).type == Material.CHAINMAIL_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.CHAINMAIL_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.CHAINMAIL_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_HELMET ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.LEATHER_HELMET ||
                                            Objects.requireNonNull(item).type == Material.LEATHER_CHESTPLATE ||
                                            Objects.requireNonNull(item).type == Material.LEATHER_LEGGINGS ||
                                            Objects.requireNonNull(item).type == Material.LEATHER_BOOTS ||
                                            Objects.requireNonNull(item).type == Material.DIAMOND_SWORD ||
                                            Objects.requireNonNull(item).type == Material.GOLDEN_SWORD ||
                                            Objects.requireNonNull(item).type == Material.IRON_SWORD ||
                                            Objects.requireNonNull(item).type == Material.STONE_SWORD ||
                                            Objects.requireNonNull(item).type == Material.NETHERITE_SWORD ||
                                            Objects.requireNonNull(item).type == Material.WOODEN_SWORD){
                                    //escaping the loop

                                    }
                                    else{
                                        howMany += item.amount //save how many item there is in the item stack
                                        p.inventory.setItem(index, null) //reset the player inventory at a given slot


                                    }
                                }
                            }

                        }
                        index++ //add one to index
                    }

                    p.updateInventory() //apply the change to the player inventory
                    try { //begin the try for the following code
                        if (actualFile.exists() && actualFile.isFile) {//check if the file exist and is a file
                            try {//trying the following code
                                val reader = Scanner(actualFile)//create the reader
                                val data = reader.nextLine()//take the first line
                                val dataInt = data.toInt()//convert it to int
                                val dataFinal = howMany + dataInt//add it to howmany
                                val dataFinalString = dataFinal.toString()//convert it to a string
                                reader.close()//close the reader
                                val writer = PrintWriter(actualFile)//create the writer
                                writer.print(dataFinalString)//write the data
                                writer.close()//close the writer
                            } catch (e: FileNotFoundException) {//catch the exeption
                                throw RuntimeException(e)//throw it away
                            }

                        } else {
                            if (actualFile.createNewFile()) { //creating the new file
                                val dataToWrite = howMany.toString()//convert it to string
                                val myWriter: FileWriter//create the file writer
                                try {//try the code
                                    myWriter = FileWriter(actualFile)//pointing the writer to the actual file
                                    myWriter.write(dataToWrite)//writing the data to the file
                                    myWriter.close()//closing the writer
                                } catch (e: IOException) {//catch the exeption
                                    throw RuntimeException(e)//throw it away
                                }
                            } else {
                                println("something went wrong while creating the file") //says that something went from while creating the file
                            }
                        }
                    } catch (e: IOException) { //catching the exception
                        throw RuntimeException(e) //create the actual error message
                    }
                }

            //add new code here
            }
        }
    }
}
