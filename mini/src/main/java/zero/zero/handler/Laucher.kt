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
                  Bukkit.dispatchCommand(p, "onCommandPvp")//dispatchCommand for pvp
                }
            }
           if(ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
               Bukkit.dispatchCommand(p, "onCommandPvpSumo")//dispatchCommand for pvp sumo
                }
           } 
           if(ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandPvpBow")//dispatchCommand pvp bow
                }
           }
           if(ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                 Bukkit.dispatchCommand(p, "onCommandPvpLoot")//dispatchCommand for pvp loot
               }
           }
           if(ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandBridge")//dispatchCommand for bridge race
               }
           }
           if(ev.clickedBlock!!.type == Material.LIME_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandParkour")//dispatchCommand for parkour race 
               }
           }
           if(ev.clickedBlock!!.type == Material.PINK_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandCaptureFlag")//dispatchCommand for capture flag 
               }
           }
           if(ev.clickedBlock!!.type == Material.GREY_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandDontDie")//dispatchCommand for dont die 
               }
           }
           if(ev.clickedBlock!!.type == Material.LIGHT_GREY_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandPvpKnockBack")//dispatch command for pvp knock back
               }
           }
           if(ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandChaiseMusical")
               }
           }
           if(ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandClimbFast")
               }
           }
           if(ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                 Bukkit.dispatchCommand(p, "onCommandCpsTest")
               }
           }
           if(ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandDodgeBall")
               }
           }
           if(ev.clickedBlock!!.type == Material.GREEN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandElytraRace")
               }
           }
           if(ev.clickedBlock!!.type == Material.RED_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFallTrap")
               }
           }
           if(ev.clickedBlock!!.type == Material.BLACK_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFindMe")
               }
           }
           if(ev.clickedBlock!!.type == Material.TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFireTrap")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandHideAndSeek")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandHorseRace")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandMlg")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandRockPaperCisor")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandSkywars")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandSwimFast")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandDodgeTag")
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandTnt")
               }
           }
        }
    }
}










