package com.elisis.anpmr.chemistry;

import java.util.ArrayList;
import java.util.List;

import com.elisis.anpmr.util.Pair;

public class PairCompoundPart<V> extends Pair<CompoundPart, V> {
	
	public PairCompoundPart(CompoundPart part, V obj) {
		super(part, obj);
	}

	public CompoundPart getPart() {
		return this.getT();
	}
	
	protected V getObj() {
		return this.getU();
	}
	
	public static <L> ArrayList<CompoundPart> getCompoundPartFromList(List<Pair<CompoundPart, L>> list) {
		return getTFromList(list);
	}
	
	public static <L> ArrayList<L> getVFromList(List<Pair<CompoundPart, L>> list) {
		return getUFromList(list);
	}
}
