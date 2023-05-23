package com.elisis.anpmr.util;

import java.util.LinkedList;
import java.util.List;

public abstract class Pair<T, U> {

	protected Pair instance;
	
	private T t;
	private U u;
	
	public Pair(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	protected T getT() {
		return this.t;
	}
	
	protected U getU() {
		return this.u;
	}
	
	public static <L, M> LinkedList<L> getTFromList(List<Pair<L, M>> list) {
		LinkedList<L> listT = new LinkedList<>();
		
		for (Pair<L, M> pair : list) {
			
			listT.add(pair.getT());
			
		}
		
		return listT;
	}
	
	public static <L, M> LinkedList<M> getUFromList(List<Pair<L, M>> list) {
		LinkedList<M> listU = new LinkedList<>();
		
		for (Pair<L, M> pair : list) {
			
			listU.add(pair.getU());
			
		}
		
		return listU;
	}
	
}
