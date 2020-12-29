package fun.nothaving.xxx;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private String pluginName = "XXX";
	
	//When plugin is Enabled
	@Override
	public void onEnable() {
		//PluginManager pm = getServer().getPluginManager();
		getLogger().info(pluginName + " has been enabled.");
	}
	
	//When plugin is disabled
	@Override
	public void onDisable() {
		getLogger().info(pluginName + " has been disabled.");
	}
	
	//Command input
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		switch(sender.getName()) {
		/*
		case"Command keyword":
			//command stuff
			return true;
		*/
		default:
			return false;
		}
		
	}
}
