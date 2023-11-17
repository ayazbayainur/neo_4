package Week3.example.neo_3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OrderDetail")
public class OrderDetailEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productId;
    @Column
    private double price;
    @Column
    private String status;


}
