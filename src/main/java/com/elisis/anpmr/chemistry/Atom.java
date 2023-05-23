package com.elisis.anpmr.chemistry;

import com.elisis.anpmr.util.Pair;
import com.elisis.anpmr.util.PairableFloat;

public class Atom implements PairableFloat {
	
	


	
	private int atomicNumber;
	private int neutronNumber;
	private float atomicMass;
	
	private float halfLife;
	
	public Atom(AtomBuilder builder) {
		
		this.atomicNumber = builder.atomicNumber;
		this.neutronNumber = builder.neutronNumber;
		this.atomicMass = builder.atomicMass;
		this.halfLife = builder.halfLife;
	
	}
	
	public float getAtomicMass() {
		return this.atomicMass;
	}
	
	
	
	public static class AtomBuilder {
		
		private int atomicNumber; //Maybe not needed, we'll see
		private int neutronNumber;
		private float atomicMass;
		
		private float halfLife;
		
		public AtomBuilder(int atomicNumber) {
			this.atomicNumber = atomicNumber;
		}
		
		
		public Atom build() {
			return new Atom(this);
		}
		
		public AtomBuilder neutrons(int neutronCount) {
			
			this.neutronNumber = neutronCount;
			this.atomicMass = this.atomicNumber + this.neutronNumber;
			return this;
		
		}
		
		
	}



	@Override
	public PairAtom<Float> with(float floatObj) {
		return new PairAtom<Float>(this, floatObj);
	}
	
	
}
