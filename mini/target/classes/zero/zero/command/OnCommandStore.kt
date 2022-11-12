package zero.zero.command

import org.bukkit.Bukkit.getServer
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.inventory.ItemStack
import org.bukkit.Material //importing the material librairy
import org.bukkit.Bukkit.getServer

//the package for this project



class OnCommandStore: CommandExecutor {// creating the class death and implementing the listener
    

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        for(p in getServer().onlinePlayers){
            if(p.name == sender.name){
                var item1:ItemStack = ItemStack(Material.IRON_SWORD, 1)
                var item2:ItemStack = ItemStack(Material.APPLE, 1)
                var item3:ItemStack = ItemStack(Material.OAK_WOOD, 1)
                var item4:ItemStack = ItemStack(Material.REDSTONE, 1)
                p.inventory.setItem(1, item1)
                p.inventory.setItem(2, item2)
                p.inventory.setItem(3, item3)
                p.inventory.setItem(4, item4)
                


            }
        }

        return false

    }
}