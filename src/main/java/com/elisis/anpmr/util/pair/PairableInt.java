package com.elisis.anpmr.util.pair;

public interface PairableInt {

	public Pair<? extends PairableInt, Integer> with(int intObj);
	
}
