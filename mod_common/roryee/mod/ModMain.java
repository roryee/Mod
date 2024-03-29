package roryee.mod;

import roryee.mod.block.ModBlocks;
import roryee.mod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModMain {

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
    }

    @Init
    public void init(FMLInitializationEvent event) {

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }

}
