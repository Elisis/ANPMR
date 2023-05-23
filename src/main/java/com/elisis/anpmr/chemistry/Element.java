package com.elisis.anpmr.chemistry;

import java.util.ArrayList;
import java.util.Arrays;

import com.elisis.anpmr.util.PairableFloat;
import com.elisis.anpmr.util.PairableInt;

public class Element implements PairableInt, PairableFloat {

	
	private String name;
	private int atomicNumber;
	
	private float atomicMass;
	
	// Isotope, Proportion
	private ArrayList<PairAtom<Float>> isotopes;
	private Atom primaryIsotope;
	
	public Element(String name, int atomicNumber) {
		this.name = name;
		this.atomicNumber = atomicNumber;
	}
	
	
	@SafeVarargs
	public final Element withIsotopes(PairAtom<Float>... isotopes) {
		
		this.isotopes.addAll(Arrays.<PairAtom<Float>>asList(isotopes));
		
		float weightedMass = 0;
		
		for (PairAtom<Float> atomPair : isotopes) {
			weightedMass += atomPair.getObj() * atomPair.getAtom().getAtomicMass();
		}
		
		this.atomicMass = weightedMass;
		
		return this;	
	
	}
	
	public Element primaryIsotope(Atom isotope) {
		this.primaryIsotope = isotope;
		return this;
	}
	
	public float getAtomicMass() {
		return this.atomicMass;
	}
	
	
	/*
	 * Pair stuff
	 */
	
	
	@Override
	public PairElement<Integer> with(int integer) {

		return new PairElement<Integer>(this, integer);	
		
	}
	
	@Override
	public PairElement<Float> with(float floatObj) {

		return new PairElement<Float>(this, floatObj);	
		
	}
}
