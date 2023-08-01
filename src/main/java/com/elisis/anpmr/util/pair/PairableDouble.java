package com.elisis.anpmr.util.pair;

public interface PairableDouble {

	public Pair<? extends PairableDouble, Double> with(double floatObj);
}
