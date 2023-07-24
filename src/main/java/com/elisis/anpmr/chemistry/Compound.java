package com.elisis.anpmr.chemistry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.elisis.anpmr.chemistry.pair.PairCompound;
import com.elisis.anpmr.chemistry.pair.PairCompoundPart;
import com.elisis.anpmr.util.Pair;
import com.elisis.anpmr.util.PairableFloat;

public class Compound implements PairableFloat {
	
	public static HashMap<String, Compound> compoundList = new HashMap<>();
	
	private String name;
	
	private float molarMass;
	private ArrayList<PairCompoundPart<Integer>> composition;
	
	protected Compound(CompoundBuilder builder) {
		this.name = builder.name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static class CompoundBuilder {
		
		private String name;
		
		private float molarMass;
		private ArrayList<PairCompoundPart<Integer>> composition;
		
		public CompoundBuilder(String name) {
			this.name = name;
		}
		
		@SafeVarargs
		/***
		 * 
		 * @param parts - Pair<> of CompoundParts and molar quantites
		 * @return Builder object
		 */
		public final CompoundBuilder withParts(PairCompoundPart<Integer>... parts) {
			
			ArrayList<CompoundPart> compoundParts = PairCompoundPart.getCompoundPartFromList(Arrays.<Pair<CompoundPart, Integer>>asList(parts));
			ArrayList<Integer> compoundMoles = PairCompoundPart.getVFromList(Arrays.<Pair<CompoundPart, Integer>>asList(parts));
			
			float totalMass = 0;
			
			for (PairCompoundPart<Integer> partPair : parts)	
				totalMass += partPair.getObj() * partPair.getPart().getMass(); // m = M * n
			
			
			this.molarMass = totalMass;
			
			return this;
		}
		
		
		public Compound build() {
			
			Compound compound = new Compound(this);
			compoundList.put(compound.getName(), compound);
			
			return compound;
		}
		
	}

	@Override
	public Pair<? extends PairableFloat, Float> with(float floatObj) {
		return new PairCompound<Float>(this, floatObj);
	}

}
