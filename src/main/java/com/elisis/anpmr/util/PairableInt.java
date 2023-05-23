package com.elisis.anpmr.util;

public interface PairableInt {

	public Pair<? extends PairableInt, Integer> with(int intObj);
	
}
