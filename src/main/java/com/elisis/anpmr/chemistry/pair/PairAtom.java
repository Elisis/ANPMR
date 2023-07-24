package com.elisis.anpmr.chemistry.pair;

import com.elisis.anpmr.chemistry.Atom;
import com.elisis.anpmr.util.Pair;

public class PairAtom<V> extends Pair<Atom, V> {

	
	public PairAtom(Atom atom, V obj) {
		super(atom, obj);
	}
	
	public Atom getAtom() {
		return this.getT();
	}
	
	public V getObj() {
		return this.getU();
	}
}
