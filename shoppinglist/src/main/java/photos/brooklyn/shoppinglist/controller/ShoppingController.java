package photos.brooklyn.shoppinglist.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import photos.brooklyn.shoppinglist.domain.ShoppingItem;
import photos.brooklyn.shoppinglist.service.ShoppingListService;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
	
	@Autowired
	private ShoppingListService service;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<ShoppingItem> listShoppingItems(){
		final List<ShoppingItem> items = service.getShoppingList();
		return items;
	}
}
