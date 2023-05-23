package com.elisis.anpmr.chemistry;

import java.util.ArrayList;
import java.util.List;

import com.elisis.anpmr.util.Pair;

public class PairElement<V> extends Pair<Element, V> {

	public PairElement(Element element, V obj) {
		super(element, obj);
	}
	
	public Element getElement() {
		return this.getT();
	}
	
	protected V getObj() {
		return this.getU();
	}
	
	public static <M> ArrayList<Element> getElementFromList(List<Pair<Element, M>> list) {
		return PairElement.<Element, M>getTFromList(list);
	}
	
	public static <M> ArrayList<M> getVFromList(List<Pair<Element, M>> list) {
		return getUFromList(list);
	}

}
