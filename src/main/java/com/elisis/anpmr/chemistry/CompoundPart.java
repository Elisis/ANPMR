package com.elisis.anpmr.chemistry;

import com.elisis.anpmr.util.PairableFloat;

public abstract class CompoundPart implements PairableFloat {
	
	protected float mass;
	
	@Override
	public PairCompoundPart<Float> with(float floatObj) {

		return new PairCompoundPart<Float>(this, floatObj);	
		
	}
	
	public float getMass() {
		return this.mass;
	}
	
}
