package com.elisis.anpmr.chemistry.pair;

import java.util.ArrayList;
import java.util.List;

import com.elisis.anpmr.chemistry.CompoundPart;
import com.elisis.anpmr.util.pair.Pair;

public class PairCompoundPart<V> extends Pair<CompoundPart, V> {
	
	public PairCompoundPart(CompoundPart part, V obj) {
		super(part, obj);
	}

	public CompoundPart getPart() {
		return this.getT();
	}
	
	public V getObj() {
		return this.getU();
	}
	
	public static <L> ArrayList<CompoundPart> getCompoundPartFromList(List<PairCompoundPart<L>> list) {
		return getTFromList(list);
	}
	
	public static <L> ArrayList<L> getVFromList(List<PairCompoundPart<L>> list) {
		return getUFromList(list);
	}
}
