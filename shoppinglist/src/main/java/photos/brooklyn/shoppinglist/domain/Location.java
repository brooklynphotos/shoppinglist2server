package photos.brooklyn.shoppinglist.domain;

public class Location {
	public Location(String store, String section) {
		this();
		this.store = store;
		this.section = section;
	}
	private String store;
	private String section;
	public Location() {}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
}
