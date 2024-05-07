package com.elisis.anpmr.chemistry.pair;

import java.util.ArrayList;
import java.util.List;

import com.elisis.anpmr.chemistry.Element;
import com.elisis.anpmr.util.pair.Pair;

public class PairElement<V> extends Pair<Element, V> {

	public PairElement(Element element, V obj) {
		super(element, obj);
	}
	
	public Element getElement() {
		return this.getT();
	}
	
	public V getObj() {
		return this.getU();
	}
	
	public static <M> ArrayList<Element> getElementsFromList(List<PairElement<M>> list) {
		return getTFromList(list);
	}
	
	public static <M> ArrayList<M> getVFromList(List<PairElement<M>> list) {
		return getUFromList(list);
	}
	
}
