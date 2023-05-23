package com.elisis.anpmr.chemistry;

import java.util.LinkedList;
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
	
	public static <L> LinkedList<CompoundPart> getCompoundPartFromList(List<Pair<CompoundPart, L>> list) {
		return getTFromList(list);
	}
	
	public static <L> LinkedList<L> getVFromList(List<Pair<CompoundPart, L>> list) {
		return getUFromList(list);
	}
}
