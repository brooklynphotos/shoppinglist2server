package photos.brooklyn.shoppinglist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import photos.brooklyn.shoppinglist.domain.Shop;
import photos.brooklyn.shoppinglist.repository.ShopRepo;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepo shopRepo;
    @Override
    public Iterable<Shop> getValidShops() {
        return shopRepo.findAll();
    }
}
