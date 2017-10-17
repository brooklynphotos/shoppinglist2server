package photos.brooklyn.shoppinglist.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import photos.brooklyn.shoppinglist.domain.Item;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Item> listShoppingItems(){
		final List<Item> items = new ArrayList<>();
		Item e1 = new Item();
		e1.setId(1);
		items.add(e1 );
		return items;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Item update(Item item){
		return item;
	}
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public Item add(Item item){
		return item;
	}
}
