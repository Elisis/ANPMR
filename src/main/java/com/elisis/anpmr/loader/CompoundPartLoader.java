package com.elisis.anpmr.loader;

import java.util.ArrayList;

import com.elisis.anpmr.ANPMR;
import com.elisis.anpmr.chemistry.CompoundPart;
import com.elisis.anpmr.chemistry.ElementLoader;
import com.elisis.anpmr.chemistry.Ion;
import com.elisis.anpmr.chemistry.Ion.IonBuilder;

public class CompoundPartLoader {

	public static ArrayList<CompoundPart> compoundPartArray = new ArrayList<>();
	
	public static ArrayList<CompoundPart> COVALENT;
	
	public static ArrayList<CompoundPart> CATION;
	public static ArrayList<CompoundPart> ANION;
	
	public static ArrayList<CompoundPart> PLUS_1, PLUS_2;
	public static ArrayList<CompoundPart> MINUS_1, MINUS_2;
	
	
	public static Ion HYDROXIDE;
	
	public static Ion NA1 = new IonBuilder().withElements(ElementLoader.Na.with(1)).withCharge(1).build();
	
	
	public static void load() {
		register();
		sortParts();
	}
	
	private static void register() {
		
		HYDROXIDE = new Ion.IonBuilder("hydroxide").withCharge(-1).withElements().build();
		compoundPartArray.add(HYDROXIDE);
		
		
		
	}
	
	
	private static void sortParts() {
		
		/*
		PLUS_1_PARTS = new ArrayList<CompoundPart>(CompoundPartList.compoundPartArray
				.stream().filter(obj -> obj.getCharge() == 1)
				.toList());
		*/
		
		for (CompoundPart part : CompoundPartLoader.compoundPartArray) {
			
			if (part instanceof CovalentPart) {
				COVALENT.add(part);
				ANPMR.logger.warn("Covalent part " + part.getName() + " added.\n");
				break;
			}
			
			switch (part.getCharge()) {
			
				case -1:
					MINUS_1.add(part);
					break;
					
				case 1:
					PLUS_1.add(part);
					break;
					
				default:
					ANPMR.logger.warn("Ionic part " + part.getName() + " added.\n");
					
					
			
			}
			
		}
		
		
		
	}
	
	
	
}
