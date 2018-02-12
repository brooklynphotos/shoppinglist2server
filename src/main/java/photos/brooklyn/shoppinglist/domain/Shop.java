package photos.brooklyn.shoppinglist.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="SHOP")
public class Shop {
    @Getter @Setter @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @Getter @Setter @Column(name="name") private String name;
    @Getter @Setter @Column(name="description") private String description;
}
