package com.elisis.anpmr.util;

import java.util.ArrayList;
import java.util.List;

public abstract class Pair<T, U> {
	
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
	
	public static <L, M> ArrayList<L> getTFromList(List<Pair<L, M>> list) {
		ArrayList<L> listT = new ArrayList<>();
		
		for (Pair<L, M> pair : list) {
			
			listT.add(pair.getT());
			
		}
		
		return listT;
	}
	
	public static <L, M> ArrayList<M> getUFromList(List<Pair<L, M>> list) {
		ArrayList<M> listU = new ArrayList<>();
		
		for (Pair<L, M> pair : list) {
			
			listU.add(pair.getU());
			
		}
		
		return listU;
	}
	
}
