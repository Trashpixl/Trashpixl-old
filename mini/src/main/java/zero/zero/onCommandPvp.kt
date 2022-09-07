package zero.zero //the package for this project



class onCommandPvp (plugin: Mini?) : CommandExecutor {// creating the class death and impplementing the listener 
    


    @Override
    fun boolean onCommandPvp(CommandSender sender, Command command, String label, String[] args) {
        location pvp = 1,2,3
        p.teleport(pvp)
        return false;
    }
}