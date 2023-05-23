package com.elisis.anpmr.chemistry;

import java.util.ArrayList;

public class Ion extends CompoundPart {

	private String name;
	private int totalCharge;
	
	private ArrayList<PairElement<Integer>> elements;
	
	public Ion(IonBuilder builder) {
		this.name = builder.name;
		this.totalCharge = builder.totalCharge;
		this.elements = builder.elements;
		this.mass = builder.mass;
	}
	
	public static class IonBuilder {
		
		private float mass;
		private String name = "NULL";
		private int totalCharge = 0;
		
		private ArrayList<PairElement<Integer>> elements;
		
		public Ion build() {
			return new Ion(this);
		}
		
		
		@SafeVarargs
		public final IonBuilder withElements(PairElement<Integer>... elements) {
			
			float totalMass = 0;
			
			for (PairElement<Integer> elementPair: elements)
				totalMass += elementPair.getObj() * elementPair.getElement().getAtomicMass();
			
			
			
			this.mass = totalMass;
			
			return this;
			
		}
		
		public IonBuilder withCharge(int charge) {
			this.totalCharge = charge;
			return this;
		}
		
		
	}
}
