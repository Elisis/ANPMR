package com.elisis.anpmr.item;

import net.minecraft.item.Item;

public abstract class BaseItem extends Item {
	
	public BaseItem() {
		super();
		this.setHasSubtypes(true);
	}

}
