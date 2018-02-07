package photos.brooklyn.shoppinglist.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import photos.brooklyn.shoppinglist.domain.Item;
import photos.brooklyn.shoppinglist.domain.Location;
import photos.brooklyn.shoppinglist.domain.ShoppingItem;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
	
	@GetMapping(value="/list")
	public List<ShoppingItem> listShoppingItems(){
	    throw new UnsupportedOperationException("Not yet ready");
	}

	/**
	 * only those the shopper is interested in
	 * @return
	 */
	@GetMapping(value="/activelist")
	public List<ShoppingItem> listActiveShoppingItems(){
		final List<ShoppingItem> items = new ArrayList<>();
		ShoppingItem e1 = new ShoppingItem();
		e1.setId(1);
		final Location loc = new Location();
		loc.setSection("baking");
		e1.setLocation(loc);
		items.add(e1);
		return items;
	}
	@PostMapping(value="/update")
	public Item update(Item item){
		return item;
	}
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public Item add(Item item){
		return item;
	}
}
