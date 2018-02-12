package photos.brooklyn.shoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photos.brooklyn.shoppinglist.domain.Shop;
import photos.brooklyn.shoppinglist.service.ShopService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService svc;

    @GetMapping("/list")
    public Iterable<Shop> getAll(){
        return svc.getValidShops();
    }

    private static Shop createShop(final int id, final String name) {
        final Shop s = new Shop();
        s.setId(id);
        s.setName(name);
        return s;
    }
}
