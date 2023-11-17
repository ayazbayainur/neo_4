package Week3.example.neo_3.repositories;

import Week3.example.neo_3.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
