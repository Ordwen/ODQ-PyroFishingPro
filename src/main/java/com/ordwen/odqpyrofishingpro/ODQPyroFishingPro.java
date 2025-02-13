package com.ordwen.odqpyrofishingpro;

import com.ordwen.odailyquests.ODailyQuests;
import com.ordwen.odailyquests.api.ODailyQuestsAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ODQPyroFishingPro extends JavaPlugin {

    @Override
    public void onLoad() {
        ODailyQuestsAPI.registerQuestType("PYRO_FISH", PyroFishQuest.class);
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PyroFishCatchListener(), ODailyQuests.INSTANCE);
    }
}
