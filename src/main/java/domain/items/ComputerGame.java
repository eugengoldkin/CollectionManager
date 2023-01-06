package domain.items;

import domain.collection.Item;
import domain.collection.ItemType;

public class ComputerGame extends Item{

	public ComputerGame(String displayTitle) {
		super(displayTitle, ItemType.COMPUTER_GAME);
		
	}

}
