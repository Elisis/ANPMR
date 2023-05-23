package com.elisis.anpmr.chemistry;

import java.util.Arrays;
import java.util.LinkedList;

import com.elisis.anpmr.util.Pair;

public class Compound {
	
	private String name;
	
	private float molarMass;
	private LinkedList<PairCompoundPart<Integer>> composition;
	
	protected Compound(CompoundBuilder builder) {
		this.name = builder.name;
	}
	
	public final class CompoundBuilder {
		
		private String name;
		
		private float molarMass;
		private LinkedList<PairCompoundPart<Integer>> composition;
		
		public CompoundBuilder(String name) {
			this.name = name;
		}
		
		public CompoundBuilder withParts(PairCompoundPart<Integer>... parts) {
			
			LinkedList<CompoundPart> compoundParts = PairCompoundPart.getCompoundPartFromList(Arrays.<Pair<CompoundPart, Integer>>asList(parts));
			LinkedList<Integer> compoundMoles = PairCompoundPart.getVFromList(Arrays.<Pair<CompoundPart, Integer>>asList(parts));
			
			float totalMass = 0;
			
			for (PairCompoundPart<Integer> partPair : parts)	
				totalMass += partPair.getObj() * partPair.getPart().getMass(); // m = M * n
			
			
			this.molarMass = totalMass;
			
			return this;
		}
		
		
		public Compound build() {
			return new Compound(this);
		}
		
	}

}
