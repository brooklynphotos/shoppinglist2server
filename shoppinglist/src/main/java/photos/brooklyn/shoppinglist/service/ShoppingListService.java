package photos.brooklyn.shoppinglist.service;

import java.util.List;

import photos.brooklyn.shoppinglist.domain.ShoppingItem;

public interface ShoppingListService {
	List<ShoppingItem> getShoppingList();
}
