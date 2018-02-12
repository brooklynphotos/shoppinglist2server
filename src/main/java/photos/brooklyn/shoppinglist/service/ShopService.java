package photos.brooklyn.shoppinglist.service;

import photos.brooklyn.shoppinglist.domain.Shop;

public interface ShopService {
    Iterable<Shop> getValidShops();
}
