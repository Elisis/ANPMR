package com.elisis.anpmr.chemistry.pair;

import java.util.ArrayList;
import java.util.List;

import com.elisis.anpmr.chemistry.Compound;
import com.elisis.anpmr.util.Pair;

public class PairCompound<V> extends Pair<Compound, V> {

	public PairCompound(Compound compound, V obj) {
		super(compound, obj);
	}
	
	public Compound getCompound() {
		return this.getT();
	}
	
	public V getV() {
		return this.getU();
	}
	
	public static <M> ArrayList<Compound> getCompoundFromList(List<Pair<Compound, M>> list) {
		return getTFromList(list);
	}
	
	public static <M> ArrayList<M> getVFromList(List<Pair<Compound, M>> list) {
		return getUFromList(list);
	}

}
