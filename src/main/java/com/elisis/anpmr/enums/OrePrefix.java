package com.elisis.anpmr.enums;

public enum OrePrefix {

	DUST("dust", null),
	;
	
	private String name;
	private String textureLocation;
	
	private OrePrefix(String name, String textureLocation) {
		this.name = name;
		this.textureLocation = textureLocation;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTextureLocation() {
		return this.textureLocation;
	}
}
