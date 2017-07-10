package photos.brooklyn.shoppinglist.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import photos.brooklyn.shoppinglist.domain.ShoppingItem;
import photos.brooklyn.shoppinglist.service.ShoppingListService;

@Service
public class ShoppingListServiceImpl implements ShoppingListService {

	@Override
	public List<ShoppingItem> getShoppingList() {
		List<ShoppingItem> items = new ArrayList<>();
		ShoppingItem e1 = new ShoppingItem();
		e1.setId(1);
		items.add(e1 );
		return items;
	}

}
