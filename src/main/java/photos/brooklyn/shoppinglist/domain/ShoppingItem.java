package photos.brooklyn.shoppinglist.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ShoppingItem {
	private int id;
	private String name;
	private int frequency;
	private Priority priority;
	private Date lastDateBought;
	private int quantity;
	private Location location;
	private String description;
	private String note;
	private boolean favorite;
	private Price price;
	private Date lastUsed;
}
