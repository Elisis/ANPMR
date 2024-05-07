package com.elisis.anpmr.chemistry;

import java.util.ArrayList;
import java.util.Arrays;

import com.elisis.anpmr.chemistry.pair.PairAtom;
import com.elisis.anpmr.chemistry.pair.PairElement;
import com.elisis.anpmr.util.pair.PairableFloat;
import com.elisis.anpmr.util.pair.PairableInt;

public class Element implements PairableInt, PairableFloat {

	
	private String name;
	private int atomicNumber;
	
	private float atomicMass;
	
	private String chemicalSymbol;
	
	// Isotope, Proportion
	private ArrayList<PairAtom<Double>> isotopes;
	private Atom primaryIsotope;
	
	public Element(String name, int atomicNumber, String chemicalSymbol) {
		this.name = name;
		this.atomicNumber = atomicNumber;
		this.chemicalSymbol = chemicalSymbol;
	}
	
	
	@SafeVarargs
	public final Element withIsotopes(PairAtom<Double>... isotopes) {
		
		this.isotopes.addAll(Arrays.<PairAtom<Double>>asList(isotopes));
		
		float weightedMass = 0;
		
		for (PairAtom<Double> atomPair : isotopes) {
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
	
	public int getAtomicNumber() {
		return this.atomicNumber;
	}
	
	public String getSymbol() {
		return this.chemicalSymbol;
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
