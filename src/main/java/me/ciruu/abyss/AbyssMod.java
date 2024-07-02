package me.ciruu.abyss;

import me.ciruu.abyss.Class489;
import me.ciruu.abyss.Manager;
import me.zero.alpine.bus.EventBus;
import me.zero.alpine.bus.EventManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;

@Mod(modid="abyssclient", name="Abyssclient", version="1.2.2")
    
public class AbyssMod {

    public static Minecraft getMinecraft();
    
    public static final String MOD_ID = "abyssclient";
    public static final String MOD_NAME = "Abyssclient";
    public static final String VERSION = "1.2.2";
    public static final String suffix = "";
    @Mod.Instance(value="abyss")
    public static AbyssMod INSTANCE;
    public static Manager manager;
    public static final EventBus EVENT_BUS;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent fMLPreInitializationEvent) {
        manager.preinit(fMLPreInitializationEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent fMLInitializationEvent) {
        MinecraftForge.EVENT_BUS.register((Object)new Class489());
        manager.init(fMLInitializationEvent);
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent fMLPostInitializationEvent) {
        manager.postinit(fMLPostInitializationEvent);
    }

    static {
        Minecraft.getMinecraft().getSession();
        Minecraft.getMinecraft().getProxy();
        Class489 Class489 = new Class489(); // Allows Minecraft Gui Screen
        manager = new Manager();
        EVENT_BUS = new EventManager();
    }
}
