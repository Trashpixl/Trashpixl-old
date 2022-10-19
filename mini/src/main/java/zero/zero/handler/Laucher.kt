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


class Laucher (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)

    }


    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        print("bob")
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { //check if the action is physical
          val p = ev.player
        if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
           if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandPvp")
                }
            }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
               Bukkit.dispatchCommand(p, "onCommandPvpSumo")
                }
           } 
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandPvpBow")
                }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                 Bukkit.dispatchCommand(p, "onCommandPvpLoot")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandBridge")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandParkour")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandCaptureFlag")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandDontDie")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandPvpKnockBack")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandChaiseMusical")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandClimbFast")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandCpsTest")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandDodgeBall")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandElytraRace")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandFallTrap")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandFindMe")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandFireTrap")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandHideAndSeek")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandHorseRace")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandMlg")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandRockPaperCisor")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandSkywars")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandSwimFast")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   p.sendCommand("onCommandDodgeTag")
               }
           }
        }
    }
}










