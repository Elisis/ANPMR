package com.elisis.anpmr.item;

import java.util.HashMap;

import com.elisis.anpmr.enums.OrePrefix;

import net.minecraft.item.ItemStack;

public class MetaItem extends BaseItem {
	
	// Map linking metadata to the actual material of the item. Differs per metaitem !!
	private HashMap<Integer, Material> metaMaterialMap = new HashMap<>();
	
	private OrePrefix prefix;
	
	public MetaItem(OrePrefix prefix) {
		super();
		this.setHasSubtypes(true);
		this.prefix = prefix;
	}
	
	public OrePrefix getPrefix() {
		return this.prefix;
	}
	
	@Override
	public String getUnlocalisedName(ItemStack stack) {
		int meta = stack.getMetadata();
		Material mat = this.metaMaterialMap.get(meta);
		//String matName =
	}
	
}
