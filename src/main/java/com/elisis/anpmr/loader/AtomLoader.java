package com.elisis.anpmr.loader;

import com.elisis.anpmr.chemistry.Atom;

public class AtomLoader {
	
	// H
	public static Atom H1; 
	public static Atom H2;
	
	// He
	public static Atom He4;
	
	
	
	public static void register() {
		H1 = new Atom.AtomBuilder(1, "Hydrogen").neutrons(0).build();
		H2 = new Atom.AtomBuilder(1, "Deuterium").neutrons(1).build();
		
		He4 = new Atom.AtomBuilder(2, "Helium").neutrons(2).build();
		
		
	}

}
