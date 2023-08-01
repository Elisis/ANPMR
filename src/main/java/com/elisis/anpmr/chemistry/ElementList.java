package com.elisis.anpmr.chemistry;

import java.util.HashMap;

import com.elisis.anpmr.loader.AtomLoader;

public class ElementList {
	
	public static HashMap<Integer, Element> elementMap = new HashMap<>();
	
	
	public static Element H;
	public static Element He;
	
	
	
	public static void register() {
		
		H = new Element("Hydrogen", 1).withIsotopes(AtomLoader.H1.with(0.99986), AtomLoader.H2.with(0.000143)).primaryIsotope(AtomLoader.H1);
		elementMap.put(H.getAtomicNumber(), H);
		
		He = new Element("Helium", 2).withIsotopes(AtomLoader.He4.with(0.999998)).primaryIsotope(AtomLoader.He4);
		elementMap.put(He.getAtomicNumber(), He);
	
		
		
	}

}
