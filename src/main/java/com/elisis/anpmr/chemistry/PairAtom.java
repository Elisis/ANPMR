package com.elisis.anpmr.chemistry;

import com.elisis.anpmr.util.Pair;

public class PairAtom<V> extends Pair<Atom, V> {

	
	public PairAtom(Atom atom, V obj) {
		super(atom, obj);
	}
	
	public Atom getAtom() {
		return this.getT();
	}
	
	protected V getObj() {
		return this.getU();
	}
}
