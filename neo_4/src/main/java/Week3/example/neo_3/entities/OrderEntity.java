package Week3.example.neo_3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order")
public class OrderEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(optional = true)
    @JoinColumn(name = "user_id")
    private UserEntity userId;
    @Version
    @Column (name = "date_of_order")
    private LocalDateTime dateOfOrder;



}
