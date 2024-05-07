package com.elisis.anpmr;

import org.apache.logging.log4j.Logger;

import com.elisis.anpmr.chemistry.Atom;
import com.elisis.anpmr.chemistry.Atom.AtomBuilder;
import com.elisis.anpmr.chemistry.Compound;
import com.elisis.anpmr.chemistry.Compound.CompoundBuilder;
import com.elisis.anpmr.chemistry.CompoundPart;
import com.elisis.anpmr.chemistry.Element;
import com.elisis.anpmr.chemistry.ElementLoader;
import com.elisis.anpmr.chemistry.Ion;
import com.elisis.anpmr.chemistry.Ion.IonBuilder;
import com.elisis.anpmr.loader.AtomLoader;
import com.elisis.anpmr.loader.CompoundLoader;
import com.elisis.anpmr.loader.CompoundPartLoader;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ANPMR.MODID, name = ANPMR.NAME, version = ANPMR.VERSION)
public class ANPMR {

	public static final String MODID = "anpmr";
	public static final String NAME = "ANPM:R";
	public static final String VERSION = "0.1.0";
	
	public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	AtomLoader.load();
    	ElementLoader.load();
    	
    	CompoundPartLoader.load();
    	CompoundLoader.load();
    	
    }
	
	
}
