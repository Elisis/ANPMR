package com.elisis.anpmr;

import org.apache.logging.log4j.Logger;

import com.elisis.anpmr.chemistry.Atom;
import com.elisis.anpmr.chemistry.Atom.AtomBuilder;
import com.elisis.anpmr.chemistry.Compound;
import com.elisis.anpmr.chemistry.Compound.CompoundBuilder;
import com.elisis.anpmr.chemistry.CompoundPart;
import com.elisis.anpmr.chemistry.Element;
import com.elisis.anpmr.chemistry.Ion;
import com.elisis.anpmr.chemistry.Ion.IonBuilder;

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
    	Atom H1 = new AtomBuilder(1).neutrons(1).build();
    	Atom O16 = new AtomBuilder(8).neutrons(8).build();
    	Atom Na23 = new AtomBuilder(11).neutrons(12).build();
    	
    	
    	Element TestElement = new Element("Hydrogen", 1).withIsotopes(H1.with(0.14f));
    	Element Oxygen = new Element("Oxygen", 8).withIsotopes(O16.with(1));
    	Element Sodium = new Element("Sodium", 11).withIsotopes(Na23.with(1));
    			
    	Ion NA2 = new IonBuilder().withElements(Sodium.with(1)).withCharge(-2).build();
    	
    	CompoundPart HYDROXIDE = new IonBuilder().withElements(TestElement.with(1)).withCharge(-1).build();
    	
    	Compound newCompound = new CompoundBuilder("Sodium Hydroxide").withParts(HYDROXIDE.with(2), NA2.with(1)).build();
    	
    }
	
	
}
