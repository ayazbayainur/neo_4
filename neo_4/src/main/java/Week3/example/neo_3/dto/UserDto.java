package Week3.example.neo_3.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;
    private String name;
    private String telephoneNumber;
    private String role;
    private String username;
    private String password;
    private String status;
}
