package Week3.example.neo_3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class ProductEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String type;
    @Column
    private String production;
    @Column(name = "initial_price")
    private double initialPrice;
    @Column
    private int quantity;
}
