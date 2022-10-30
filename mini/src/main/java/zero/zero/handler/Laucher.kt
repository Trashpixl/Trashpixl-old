package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import zero.zero.Zero


class Laucher(plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)

    }


    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is

        if (ev.action == Action.RIGHT_CLICK_BLOCK) { //check if the action is physical
            val p = ev.player
            if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
                if (p.location.world.name.endsWith("lobby_server")) {
                    for (p2 in Bukkit.getServer().onlinePlayers) {
                        if (p2.location.world.name.endsWith("lobby_server")) {
                            Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                            Bukkit.dispatchCommand(p, "oncommandpvp")//dispatchCommand for parkour
                        }
                    }
                }
                if (ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA) {
                    if (p.location.world.name.endsWith("lobby_server")) {
                        for (p2 in Bukkit.getServer().onlinePlayers) {
                            if (p2.location.world.name.endsWith("lobby_server")) {
                                Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                Bukkit.dispatchCommand(p, "oncommandpvpsumo")//dispatchCommand for parkour
                            }
                        }
                    }
                    if (ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA) {
                        if (p.location.world.name.endsWith("lobby_server")) {
                            for (p2 in Bukkit.getServer().onlinePlayers) {
                                if (p2.location.world.name.endsWith("lobby_server")) {
                                    Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                    Bukkit.dispatchCommand(p, "oncommandpvpbow")//dispatchCommand for parkour
                                }
                            }
                        }
                        if (ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA) {
                            if (p.location.world.name.endsWith("lobby_server")) {
                                for (p2 in Bukkit.getServer().onlinePlayers) {
                                    if (p2.location.world.name.endsWith("lobby_server")) {
                                        Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                        Bukkit.dispatchCommand(p, "oncommandpvploot")//dispatchCommand for parkour
                                    }
                                }
                            }
                            if (ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA) {
                                if (p.location.world.name.endsWith("lobby_server")) {
                                    for (p2 in Bukkit.getServer().onlinePlayers) {
                                        if (p2.location.world.name.endsWith("lobby_server")) {
                                            Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                            Bukkit.dispatchCommand(p, "oncommandbridge")//dispatchCommand for bridge
                                        }
                                    }
                                }
                                if (ev.clickedBlock!!.type == Material.LIME_TERRACOTTA) {
                                    if (p.location.world.name.endsWith("lobby_server")) {
                                        for (p2 in Bukkit.getServer().onlinePlayers) {
                                            if (p2.location.world.name.endsWith("lobby_server")) {
                                                Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                                Bukkit.dispatchCommand(p, "oncommandparkour")//dispatchCommand for parkour
                                            }
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
                                                for (p2 in Bukkit.getServer().onlinePlayers) {
                                                    if (p2.location.world.name.endsWith("lobby_server")) {
                                                        Bukkit.dispatchCommand(p2, "function server:tp_world_server")
                                                        Bukkit.dispatchCommand(p, "oncommandtnt")//dispatchCommand for tnt race
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
        }
    }
}











