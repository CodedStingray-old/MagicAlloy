package net.codedstingray.magicalloy;

import net.codedstingray.magicalloy.init.ModRecipes;
import net.codedstingray.magicalloy.proxy.CommonProxy;
import net.codedstingray.magicalloy.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid= Reference.ID,
        name=Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.MC_VERSIONS
)
public class MagicAlloy {

    @Mod.Instance
    public static MagicAlloy instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    private Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("pre-initialization started");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("initialization started");
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("post-initialization started");
    }
}
