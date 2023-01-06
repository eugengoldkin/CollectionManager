package domain.collection;

import domain.items.ComputerGame;

import java.util.ArrayList;
import java.util.List;

public enum ItemType {
	
	COMPUTER_GAME("Computer Game", ComputerGame.class, ""),
	
	
	;
	
	private String name, description;
	private Class<? extends Item> itemClass;
	
	private static ArrayList<ItemType> listOfTypes = new ArrayList<ItemType>();
	
	private ItemType(String name, Class<? extends Item> itemClass, String description) {
		this.name = name;
		this.itemClass = itemClass;
		this.description = description;
	}

	public static List<ItemType> getListOfTypes(){
		if(listOfTypes.isEmpty()) {
			listOfTypes.add(COMPUTER_GAME);
			// Add all Types here
		}
		return listOfTypes;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Class<? extends Item> getItemClass() {
		return itemClass;
	}	
	

	
}
