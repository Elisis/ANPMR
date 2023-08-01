package com.elisis.anpmr.chemistry;

import com.elisis.anpmr.chemistry.pair.PairCompoundPart;
import com.elisis.anpmr.util.pair.PairableInt;

public abstract class CompoundPart implements PairableInt {
	
	protected float mass;
	
	@Override
	public PairCompoundPart<Integer> with(int intObj) {

		return new PairCompoundPart<Integer>(this, intObj);	
		
	}
	
	public float getMass() {
		return this.mass;
	}
	
}
