package data;


import domain.collection.Collection;

public class CollectionAdministrator {

	private static Collection C;

	public static Collection getCollection() {
		return C;
	}

	public static void setCollection(Collection collection) {
		C = collection;
	}
	
}
