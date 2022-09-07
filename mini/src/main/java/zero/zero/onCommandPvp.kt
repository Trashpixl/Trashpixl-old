package zero.zero //the package for this project



class onCommandPvp (plugin: Mini?) : CommandExecutor {// creating the class death and impplementing the listener 
    


    @Override
    fun boolean onCommandPvp(CommandSender sender, Command command, String label, String[] args) {
        location pvp = p.getLocation()
        pvp.setWorld("overworld")
        pvp.setX(0)
        pvp.setY(0)
        pvp.setZ(0)
        p.teleport(pvp)
        return false;
    }
}