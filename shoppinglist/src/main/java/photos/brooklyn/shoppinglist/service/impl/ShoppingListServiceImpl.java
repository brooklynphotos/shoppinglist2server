package photos.brooklyn.shoppinglist.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import photos.brooklyn.shoppinglist.domain.Location;
import photos.brooklyn.shoppinglist.domain.Price;
import photos.brooklyn.shoppinglist.domain.Priority;
import photos.brooklyn.shoppinglist.domain.ShoppingItem;
import photos.brooklyn.shoppinglist.service.ShoppingListService;

@Service
public class ShoppingListServiceImpl implements ShoppingListService {

	@Override
	public List<ShoppingItem> getShoppingList() {
		List<ShoppingItem> items = new ArrayList<>();
		final int randomCount = (int)(Math.random()*20);
		final Location[] locations = {
			new Location("Whole Foods","Produce"),
			new Location("Whole Foods","Dairy"),
			new Location("Whole Foods","Meat"),
		};
		for(int i=0;i<randomCount;i++) {
			ShoppingItem e1 = new ShoppingItem();
			e1.setId(i+1);
			e1.setName("Hello"+(int)(Math.random()*100));
			e1.setFrequency((int)(Math.random()*12)+1);
			e1.setDescription("DescriptionL "+e1.getName());
			e1.setFavorite(true);
			e1.setLastDateBought(new Date(new Date().getTime()-(long)(Math.random()*10000)));
			e1.setLocation(locations[(int)(Math.random()*locations.length)]);
			e1.setPrice(new Price((double)(Math.random()*100),"lb"));
			e1.setPriority(Priority.values()[(int)(Math.random()*Priority.values().length)]);
			e1.setQuantity((int)(Math.random()*10));
			items.add(e1);
		}
		return items;
	}

}
