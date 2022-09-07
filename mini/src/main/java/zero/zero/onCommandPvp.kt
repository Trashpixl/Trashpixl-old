package zero.zero //the package for this project


import org.bukkit.Bukkit //importing bukkit
import org.bukkit.entity.Player // importing the player entitty
import org.bukkit.event.EventHandler //importing the event handler
import org.bukkit.event.Listener //importing the handler
import org.bukkit.event.entity.PlayerDeathEvent //importing the player death event


class onCommandPvp (plugin: Mini?) : CommandExecutor {// creating the class death and impplementing the listener 
    


    @Override
    fun boolean onCommandPvp(CommandSender sender, Command command, String label, String[] args) {

        return false;
    }
}