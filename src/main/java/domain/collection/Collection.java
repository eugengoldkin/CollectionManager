package domain.collection;

import java.util.ArrayList;

public class Collection {
	
	private final ItemType itemType;
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	public Collection(ItemType itemType) {
		this.itemType = itemType;
	}
	
	public boolean add(Item item) {
		if(item.getItemType().equals(itemType)) {
			return itemList.add(item);
		}else {
			return false;
		}
	}
}
