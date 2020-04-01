package com.nexh.bc;

import org.bukkit.plugin.java.JavaPlugin;
import com.nexh.cmds.*;
import com.nexh.listeners.*;

public class Main extends JavaPlugin {

    public Main() {
    }

    @Override
    public void onEnable() {

        /* this.getCommand("gamemode").setExecutor(new Gamemode());
        this.getCommand("mute").setExecutor(new Mute());
        this.getCommand("clearchat").setExecutor(new Clearchat());
        this.getCommand("ccx").setExecutor(new Clearchat());
        getServer().getPluginManager().registerEvents(new muteListener(), this); */
        this.getCommand("clearchat").setExecutor(new clearChat());
        this.getCommand("globalmute").setExecutor(new globalMute());
        getServer().getPluginManager().registerEvents(new muteListener(), this);
        loadConfig();
    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }


}
