package zero.zero.handler //the package for this project


import org.bukkit.Bukkit //import all the other class
import org.bukkit.Material //import all the material
import org.bukkit.event.EventHandler //import the event handler
import org.bukkit.event.Listener //import all the listener
import org.bukkit.event.block.Action //import the action related to the block
import org.bukkit.event.player.PlayerJoinEvent //import the action related to the player
import zero.zero.Zero //import zero
import java.io.File// importing the java file var
import java.io.FileWriter// importing the filewriter
import java.io.IOException// imprting the io exeption
import java.util.*// importing all the java util class


class LauncherJoin (plugin: Zero?) : Listener { // the implements for the listener

    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)//init the plugin
    }

    @EventHandler
    fun pressurePlateHandler(ev: PlayerJoinEvent) { //describes what the event is
                val p = ev.player //create the local player id
                //p.connect("mini")
                val fileName = "Server.txt"// creating the file name var 
                val actualFile = File(fileName)// creating the file 
                var Serv = 0// creating the actual data var
                try {// trying the code
                    if (actualFile.exists() && actualFile.isFile) {//checking if actual file is a file 
                        try {
                            val reader = Scanner(actualFile)//creating the scanner
                            val data = reader.nextLine()// reading the first line
                            Serv = data.toInt()// converting the data to an int
                            reader.close()// closing the reader
                        } catch (e: IOException) {// catching the exeption 
                            throw RuntimeException(e)// trowing the exeption
                        }
                    }
                } catch (e: IOException) {// catching the exeption
                    throw RuntimeException(e)// trowing it again
                }
                if(Serv == 1){
                    val fileName2 = "S:\\Mini.txt"// creating the file name var 
                    val actualFile2 = File(fileName2)// creating the file 
                    var Mini:Int// creating the actual data var
                    try {// trying the code
                        if (actualFile2.exists() && actualFile2.isFile) {//checking if actual file is a file 
                            try {
                                val reader2 = Scanner(actualFile2)//creating the scanner
                                val data2 = reader2.nextLine()// reading the first line
                                Mini = data2.toInt()// converting the data to an int
                                reader2.close()// closing the reader
                                if(Mini == 1){
                                    print("mini 1!!")
                                    Bukkit.dispatchCommand(p, "oncommandpvp")//dispatchCommand for parkour
                                }
                                if(Mini == 2){
                                    Bukkit.dispatchCommand(p, "oncommandpvpsumo")//dispatchCommand for parkour
                                }
                                if(Mini == 3){
                                    Bukkit.dispatchCommand(p, "oncommandpvpbow")//dispatchCommand for parkour
                                }
                                if(Mini == 4){
                                    Bukkit.dispatchCommand(p, "oncommandpvploot")//dispatchCommand for parkour
                                }
                                if(Mini == 5){
                                    Bukkit.dispatchCommand(p, "oncommandbridge")//dispatchCommand for bridge
                                }
                                if(Mini == 6){
                                    Bukkit.dispatchCommand(p, "oncommandparkour")//dispatchCommand for parkour
                                }
                                if(Mini == 7){
                                    Bukkit.dispatchCommand(p, "oncommandpvpknockback")//dispatchCommand for pvp knock back
                                }
                                if(Mini == 8){
                                    Bukkit.dispatchCommand(p, "oncommandcpstest")//dispatchCommand for parkour
                                }
                                if(Mini == 9){
                                    Bukkit.dispatchCommand(p, "oncommandtnt")//dispatchCommand for tnt race
                                }
                                if(Mini == 10){
                                   
                                } 
                        else{
                            p.sendMessage("check the file path big")
                        }
                }
            }
        }
        catch(e: IOException) {// catching the exeption
            throw RuntimeException(e)// trowing it again
        }
    }
}
}

   