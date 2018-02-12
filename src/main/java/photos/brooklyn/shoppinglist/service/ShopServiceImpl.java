package photos.brooklyn.shoppinglist.service;

import org.springframework.beans.factory.annotation.Autowired;
import photos.brooklyn.shoppinglist.domain.Shop;
import photos.brooklyn.shoppinglist.repository.ShopRepo;

public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepo shopRepo;
    @Override
    public Iterable<Shop> getValidShops() {
        return shopRepo.findAll();
    }
}
