package photos.brooklyn.shoppinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import photos.brooklyn.shoppinglist.domain.Shop;

public interface ShopRepo extends JpaRepository<Shop,Integer> {

}
