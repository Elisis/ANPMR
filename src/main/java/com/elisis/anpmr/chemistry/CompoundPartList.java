package com.elisis.anpmr.chemistry;

import java.util.ArrayList;

public class CompoundPartList {

	public static ArrayList<CompoundPart> compoundPartArray = new ArrayList<>();
	
	public static final Ion HYDROXIDE = new Ion.IonBuilder().withCharge(-1).withElements().build();
	
	
	
	public static void register() {
		
		compoundPartArray.add(HYDROXIDE);
		
		
		
	}
	
	
	
}
