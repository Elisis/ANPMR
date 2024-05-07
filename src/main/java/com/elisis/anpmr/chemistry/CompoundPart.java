package com.elisis.anpmr.chemistry;

import java.util.ArrayList;

import com.elisis.anpmr.chemistry.pair.PairCompoundPart;
import com.elisis.anpmr.chemistry.pair.PairElement;
import com.elisis.anpmr.util.pair.PairableInt;

public abstract class CompoundPart implements PairableInt {
	
	protected float mass;
	
	private String name;
	
	@Override
	public PairCompoundPart<Integer> with(int intObj) {

		return new PairCompoundPart<Integer>(this, intObj);	
		
	}
	
	public float getMass() {
		return this.mass;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract int getCharge();
	
	public abstract String getFormula();
	
	public abstract ArrayList<PairElement<Integer>> getElements();
	
}
