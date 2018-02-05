package photos.brooklyn.shoppinglist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photos.brooklyn.shoppinglist.domain.Shop;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @GetMapping("/list")
    public List<Shop> getAll(){
        return Arrays.asList(
            createShop(1, "Whole Foods"),
            createShop(2, "WF 365"),
            createShop(3, "Trader Joe's"),
            createShop(4, "Stop and Shop")
        );
    }

    private static Shop createShop(final int id, final String name) {
        final Shop s = new Shop();
        s.setId(id);
        s.setName(name);
        return s;
    }
}
