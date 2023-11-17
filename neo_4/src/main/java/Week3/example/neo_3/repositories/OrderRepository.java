package Week3.example.neo_3.repositories;
import Week3.example.neo_3.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{
}

