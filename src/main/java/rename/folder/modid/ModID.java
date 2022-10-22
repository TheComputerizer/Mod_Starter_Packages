package mods.thecomputerizer.musictriggers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModID.MODID, name = ModID.NAME, version = ModID.VERSION, dependencies = ModID.DEPENDENCIES)
public class ModID {
    public static final String MODID = "modid";
    public static final String NAME = "Mod Name";
    public static final String VERSION = "1.12.2-1.0";
    public static final String DEPENDENCIES = "";
    public static Logger LOGGER = LogManager.getLogger(MODID);

    public ModID() {

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
