package photos.brooklyn.shoppinglist.domain;

import lombok.Getter;
import lombok.Setter;

public class ItemCost {
    @Getter @Setter private Item item;
    @Getter @Setter private Shop shop;
    @Getter @Setter private Double cost;
}
