package com.elisis.anpmr.loader;

import java.util.Arrays;
import java.util.HashMap;

import com.elisis.anpmr.ANPMR;
import com.elisis.anpmr.chemistry.Compound;
import com.elisis.anpmr.chemistry.CompoundPart;
import com.elisis.anpmr.chemistry.pair.PairElement;

public class CompoundLoader {
	
	public static HashMap<String, Compound> compounds;
	
	public static void load() {		
		
		createCompounds();
		
		
	}
	
	private static void createCompounds() {
		
		for (CompoundPart partCation : CompoundPartLoader.CATION) {
			
			for (CompoundPart partAnion : CompoundPartLoader.ANION) {
				
				int anionCount = Math.abs(partCation.getCharge());
				int cationCount = Math.abs(partAnion.getCharge());
				
				int totalAtomsAnion = 0;
				
				int anionElementNumber = Arrays.stream(PairElement.getVFromList(partAnion.getElements()).toArray(Integer[]::new)).mapToInt(Integer::intValue).sum();
				int cationElementNumber = Arrays.stream(PairElement.getVFromList(partCation.getElements()).toArray(Integer[]::new)).mapToInt(Integer::intValue).sum();
				
				
				//String cationRatioFormula = (cationElementNumber)
				
				// (NH4)2 vs Na2
				String anionRatioFormula = (anionElementNumber > 1 ? "(" + partAnion.getFormula() + ")" + anionCount : partAnion.getFormula() + anionCount);
				
				
				
				
				//String formula = partCation.getFormula() + ;
				
				Compound compound = new Compound.CompoundBuilder(partCation.getName() + " " + partAnion.getName())
						.withParts(partCation.with(cationCount), partAnion.with(anionCount)).build();
				
				ANPMR.logger.warn("Compound " + compound.getName() + " Registered!\n");
				
				//compounds.add(partCation.getName()compound);
			
			}
			
		}
		
	}

}
