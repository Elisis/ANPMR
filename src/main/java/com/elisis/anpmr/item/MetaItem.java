package com.elisis.anpmr.item;

import com.elisis.anpmr.enums.OrePrefix;

public class MetaItem extends BaseItem {
	
	private OrePrefix prefix;
	
	public MetaItem(OrePrefix prefix) {
		super();
		this.prefix = prefix;
	}
	
	public OrePrefix getPrefix() {
		return this.prefix;
	}
	
}
