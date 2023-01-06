package domain.collection;

public abstract class Item {

	private static int nextID = 0;
	private String displayTitle;
	private ItemType itemType;
	private final int ID;
	private String fileName;
	
	public Item(String displayTitle, ItemType itemType) {
		this.displayTitle = displayTitle;
		this.itemType = itemType;
		this.fileName = displayTitle;
		ID = nextID;
		nextID++;
	}

	public String getDisplayTitle() {
		return displayTitle;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public int getID() {
		return ID;
	}

	public String getFileName() {
		return fileName;
	}
	
}
