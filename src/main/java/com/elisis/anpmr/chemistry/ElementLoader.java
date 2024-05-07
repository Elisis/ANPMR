package com.elisis.anpmr.chemistry;

import java.util.HashMap;

import com.elisis.anpmr.loader.AtomLoader;

public class ElementLoader {
	
	public static HashMap<Integer, Element> elementMap = new HashMap<>();
	
	
	public static Element H;
	public static Element He;
	public static Element Na;
	
	public static void load() {
		register();
	}
	
	
	private static void register() {
		
		H = new Element("Hydrogen", 1, "H").withIsotopes(AtomLoader.H1.with(0.99986), AtomLoader.H2.with(0.000143)).primaryIsotope(AtomLoader.H1);
		elementMap.put(H.getAtomicNumber(), H);
		
		He = new Element("Helium", 2, "He").withIsotopes(AtomLoader.He4.with(0.999998)).primaryIsotope(AtomLoader.He4);
		elementMap.put(He.getAtomicNumber(), He);
		
		He = new Element("Sodium", 11, "Na").withIsotopes(AtomLoader.He4.with(0.999998)).primaryIsotope(AtomLoader.He4);
		elementMap.put(He.getAtomicNumber(), He);
	
		
		
	}

}
