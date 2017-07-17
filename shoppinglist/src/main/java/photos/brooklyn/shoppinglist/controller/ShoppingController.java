package photos.brooklyn.shoppinglist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import photos.brooklyn.shoppinglist.domain.ShoppingItem;
import photos.brooklyn.shoppinglist.service.ShoppingListService;

@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {
	private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
	
	@Autowired
	private ShoppingListService service;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public Map<String, ?> listShoppingItems(){
		final List<ShoppingItem> items = service.getShoppingList();
		logger.debug("Retrieved "+items.size()+" items");
		return createSuccess(items);
	}

	private Map<String, ?> createSuccess(Object data) {
		final Map<String,? super Object> m = new HashMap<>(2);
		m.put("success", true);
		m.put("data", data);
		return m;
	}
}
