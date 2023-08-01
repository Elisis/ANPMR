package com.elisis.anpmr.item;

import java.util.ArrayList;
import java.util.Arrays;

import com.elisis.anpmr.chemistry.Compound;
import com.elisis.anpmr.chemistry.pair.PairCompound;

public class DryMaterial extends Material {
	
	// Compound, proportion
	private ArrayList<PairCompound<Double>> composition = new ArrayList<>();
	
	private String name;
	
	public DryMaterial(DryMaterialBuilder builder) {
		this.name = builder.name;
		this.composition = builder.composition;
	}
	
	public String getName() {
		return this.getName();
	}
	
	public ArrayList<Compound> getCompoundList() {
		return PairCompound.getCompoundFromList(this.composition);
	}
	
	public static class DryMaterialBuilder {
		
		private String name;
		private ArrayList<PairCompound<Double>> composition = new ArrayList<>();
		
		public DryMaterialBuilder(String name) {
			this.name = name;
			
		}
		
		@SafeVarargs
		public final DryMaterialBuilder withCompounds(PairCompound<Double>... compounds) {
			this.composition.addAll(Arrays.asList(compounds));
			return this;
		}
		
		
		public DryMaterial build() {
			return new DryMaterial(this);
		}
		
	}

}
