package com.elisis.anpmr.chemistry;

import com.elisis.anpmr.chemistry.pair.PairAtom;
import com.elisis.anpmr.util.pair.PairableDouble;

public class Atom implements PairableDouble {
	
	


	
	private int atomicNumber;
	private int neutronNumber;
	private float atomicMass;
	
	private float halfLife;
	
	private String otherName = ""; //Alternative name, instead of, say, Hydrogen-2
	
	public Atom(AtomBuilder builder) {
		
		this.atomicNumber = builder.atomicNumber;
		this.neutronNumber = builder.neutronNumber;
		this.atomicMass = builder.atomicMass;
		this.halfLife = builder.halfLife;
		this.otherName = builder.otherName;
	
	}
	
	public float getAtomicMass() {
		return this.atomicMass;
	}
	
	
	
	public static class AtomBuilder {
		
		private int atomicNumber; //Maybe not needed, we'll see
		private int neutronNumber;
		private float atomicMass;
		
		private String otherName = "";
		
		private float halfLife;
		
		public AtomBuilder(int atomicNumber) {
			this.atomicNumber = atomicNumber;
		}
		
		public AtomBuilder(int atomicNumber, String otherName) {
			this(atomicNumber);
			this.otherName = otherName;
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
	public PairAtom<Double> with(double d) {
		return new PairAtom<Double>(this, d);
	}
	
	
}
