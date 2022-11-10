package zero.zero.handler//the package for this project


import org.bukkit.Bukkit //importing bukkit
import org.bukkit.Material //importing the material library
import org.bukkit.event.EventHandler //importing the event handler class
import org.bukkit.event.Listener //importing the event listenner class
import org.bukkit.event.block.Action //importing the block action class to get if they set on a block
import org.bukkit.event.player.PlayerInteractEvent //importing the player interacte event to get if they click on something
import zero.zero.Zero //importing zero


class Laucher(plugin: Zero?) : Listener {// creating the class and extending it with the main class and implement the listener
    // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//init the handler
    }
    
    @EventHandler// define that it is an event handler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { //check if the action is physical
            val p = ev.player// creating the p variable and assigne the player to it 
            if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { //compare what the player sept on to white terracotta and is required a non-nullable
                if (p.location.world.name.endsWith("lobby_server")) {// checking if the player is in the lobby
                    for (p2 in Bukkit.getServer().onlinePlayers) {//taking all the player 
                        if (p2.location.world.name.endsWith("lobby_server")) {// checking if they are in the lobby
                            Bukkit.dispatchCommand(p2, "function server:tp_world_server")// tp to the world server
                        }
                        Bukkit.dispatchCommand(p, "oncommandpvp")//dispatchCommand for parkour
                    }
                }
            }
                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) {//if the block is orange terracotta
                    if (p.location.world.name.endsWith("lobby_server")) {//check if he is in the lobby
                        for (p2 in Bukkit.getServer().onlinePlayers) {//take all the online player
                            if (p2.location.world.name.endsWith("lobby_server")) {//check if they are in the lobby
                                Bukkit.dispatchCommand(p2, "function server:tp_world_server")// tp them in the main world
                            }
                            Bukkit.dispatchCommand(p, "oncommandpvpsumo")//dispatchCommand for parkour
                        }
                    }
                }
                    if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) {//check if the block is magenta terracotta
                        if (p.location.world.name.endsWith("lobby_server")) {//check if the caller is in the lobby
                            for (p2 in Bukkit.getServer().onlinePlayers) {//get all the online player
                                if (p2.location.world.name.endsWith("lobby_server")) {//check if they are in the lobby
                                    Bukkit.dispatchCommand(p2, "function server:tp_world_server")// tp them if they are
                                }
                                Bukkit.dispatchCommand(p, "oncommandpvpbow")//dispatchCommand for parkour
                            }
                        }
                    }
                        if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) {//check if the block is light blue terracotta
                            if (p.location.world.name.endsWith("lobby_server")) {//check if the sender is in the lobby
                                for (p2 in Bukkit.getServer().onlinePlayers) {//get all the online player
                                    if (p2.location.world.name.endsWith("lobby_server")) {//check if they are in the lobby
                                        Bukkit.dispatchCommand(p2, "function server:tp_world_server")//tp the player in the game world if they are
                                    }
                                    Bukkit.dispatchCommand(p, "oncommandpvploot")//dispatchCommand for parkour
                                }
                            }
                        }
                            if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) {
                                if (p.location.world.name.endsWith("lobby_server")) {
                                    for (p2 in Bukkit.getServer().onlinePlayers) {
                                        if (p2.location.world.name.endsWith("lobby_server")) {
                                            Bukkit.dispatchCommand(p2, "function server:tp_world_server")  
                                        }
                                        Bukkit.dispatchCommand(p, "oncommandbridge")//dispatchCommand for bridge
                                    }
                                }
                            }
                                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) {
                                    if (p.location.world.name.endsWith("lobby_server")) {
                                        for (p2 in Bukkit.getServer().onlinePlayers) {
                                            if (p2.location.world.name.endsWith("lobby_server")) {
                                                Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                            }
                                            Bukkit.dispatchCommand(p, "oncommandparkour")//dispatchCommand for parkour
                                        }
                                    }
                                }
                                if (ev.clickedBlock!!.type == Material.PINK_TERRACOTTA) {
                                    if (p.location.world.name.endsWith("lobby_server")) {
                                        p.sendMessage("not available yet")
                                        //Bukkit.dispatchCommand(p, "oncommandcaptureflag")//dispatchCommand for capture flag
                                    }
                                }
                                if (ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA) {
                                    if (p.location.world.name.endsWith("lobby_server")) {
                                        p.sendMessage("not available yet")
                                        //Bukkit.dispatchCommand(p, "oncommanddontdie")//dispatchCommand for dont die
                                    }
                                }
                                if (ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA) {
                                    if (p.location.world.name.endsWith("lobby_server")) {
                                        for (p2 in Bukkit.getServer().onlinePlayers) {
                                            if (p2.location.world.name.endsWith("lobby_server")) {
                                                Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                            }
                                            Bukkit.dispatchCommand(p, "oncommandpvpknockback")//dispatchCommand for parkour
                                        }
                                    }
                                }
                                    if (ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA) {
                                        if (p.location.world.name.endsWith("lobby_server")) {
                                            p.sendMessage("not available yet")
                                            //Bukkit.dispatchCommand(p, "oncommandchaismMusical")//dispatchCommand for chaise musical
                                        }
                                    }
                                    if (ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA) {
                                        if (p.location.world.name.endsWith("lobby_server")) {
                                            p.sendMessage("not available yet")
                                            //Bukkit.dispatchCommand(p, "oncommandclimbfast")// dispatchCommand for climb fast
                                        }
                                    }
                                    if (ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA) {
                                        if (p.location.world.name.endsWith("lobby_server")) {
                                            for (p2 in Bukkit.getServer().onlinePlayers) {
                                                if (p2.location.world.name.endsWith("lobby_server")) {
                                                    Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                                }
                                                Bukkit.dispatchCommand(p, "oncommandcpstest")//dispatchCommand for parkour
                                            }
                                        }
                                    }
                                        if (ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommanddodgeball")//dispatch command for dodge ball
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.GREEN_TERRACOTTA) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandelytrarace")//dispatchCommand for elytra race
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.RED_TERRACOTTA) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandfalltrap")//dispatchCommand for fall trap
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.BLACK_TERRACOTTA) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandfindme")//dispatchCommand for findme
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.TERRACOTTA) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandfiretrap")//dispatchCommand for firetrap
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                               // Bukkit.dispatchCommand(p, "oncommandhideandseek")//dispatchCommand for hide and seek
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandhorserace")//dispatchCommand for horse race
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandmlg")//dispatchCommand for mlg
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandrockpapercisor")//dispatchCommand for rock paper scissor
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                               // Bukkit.dispatchCommand(p, "oncommandskywars")//dispatchCommand for skywars
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "onCommandswimfast")//dispatchCommand for swim fast
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.STONE_STAIRS) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                p.sendMessage("not available yet")
                                                //Bukkit.dispatchCommand(p, "oncommandtag")//dispatchCommand for tag
                                            }
                                        }
                                        if (ev.clickedBlock!!.type == Material.BLACK_CONCRETE) {
                                            if (p.location.world.name.endsWith("lobby_server")) {
                                                Bukkit.dispatchCommand(p, "function server:tp_world_server")
                                                for (p2 in Bukkit.getServer().onlinePlayers) {
                                                    if (p2.location.world.name.endsWith("lobby_server")) {
                                                        Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                                    }
                                                }
                                                Bukkit.dispatchCommand(p, "oncommandtnt")//dispatchCommand for tnt race
                                            }
                                        }
                                    }
                                }
                            }












