package Week3.example.neo_3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class UserEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    private String role;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String status;



}
