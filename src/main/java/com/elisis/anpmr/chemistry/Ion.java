package com.elisis.anpmr.chemistry;

import java.util.ArrayList;

import com.elisis.anpmr.chemistry.pair.PairElement;

public class Ion extends CompoundPart {

	private String name;
	private String formula;
	private int totalCharge;
	
	private ArrayList<PairElement<Integer>> elements;
	
	public Ion(IonBuilder builder) {
		this.name = builder.name;
		this.totalCharge = builder.totalCharge;
		this.elements = builder.elements;
		this.mass = builder.mass;
		this.formula = builder.formula;
	}
	
	public static class IonBuilder {
		
		private float mass;
		private String name = "";
		private int totalCharge = 0;
		
		private String formula;
		
		private ArrayList<PairElement<Integer>> elements;
		
		public IonBuilder(String name) {
			this.name = name;
		}
		
		public IonBuilder() {
		}
		
		public Ion build() {
			
			this.formula = "";
			
			for (PairElement<Integer> pair : this.elements) {
				
				Element element = pair.getElement();
				int amount = pair.getObj();
				
				formula += element.getSymbol() + amount;
				
			}
			
			formula += this.totalCharge;
			
			if ("".equals(this.name)) {
				
				this.name = this.formula;				
				
			}
			
			return new Ion(this);
		}
		
		
		@SafeVarargs
		/***
		 * 
		 * @param elements - Pair<> of elements and number of moles for each
		 * @return IonBuilder object
		 */
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

	@Override
	public String getName() {
		return this.name;
	}
	
	public String getFormula() {
		return this.formula;
	}
	
	@Override
	public int getCharge() {
		return this.totalCharge;
	}
}
