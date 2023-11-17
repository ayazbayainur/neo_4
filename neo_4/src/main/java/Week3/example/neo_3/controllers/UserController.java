package Week3.example.neo_3.controllers;

import Week3.example.neo_3.dto.UserDto;
import Week3.example.neo_3.entities.UserEntity;
import Week3.example.neo_3.repositories.UserRepository;
import Week3.example.neo_3.repositories.OrderRepository;
import Week3.example.neo_3.services.UserService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
//import java.util.Optional;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user){
        UserDto savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable ("id") Long UserId){
        UserDto user = userService.getUserById(UserId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                              @RequestBody UserDto user){
        user.setId(userId);
        UserDto updatedUser = userService.updateUserStatus(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

}
