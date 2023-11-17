package Week3.example.neo_3.services;

import Week3.example.neo_3.dto.UserDto;
import Week3.example.neo_3.entities.UserEntity;
import Week3.example.neo_3.mappers.UserMapper;
import Week3.example.neo_3.repositories.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserDto createUser (UserDto userDto){
        // Convert UserDto into User JPA Entity
        UserEntity user = UserMapper.mapToUser(userDto);
        UserEntity savedUser = userRepository.save(user);
        // Convert User JPA entity to UserDto
        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        return savedUserDto;
    }

    public UserDto getUserById(Long userId) {
        Optional<UserEntity> optionalUser = userRepository.findById(Math.toIntExact(userId));
        UserEntity user = optionalUser.get();
        return UserMapper.mapToUserDto(user);
    }

    public List<UserDto> getAllUsers(){
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }

    public UserDto updateUserUsername(UserDto user){
        UserEntity existingUser = userRepository.findById((int) user.getId()).get();
        existingUser.setUsername(user.getUsername());
        UserEntity updatedUser = userRepository.save(existingUser);
        return UserMapper.mapToUserDto(updatedUser);
    }

    public UserDto updateUserStatus(UserDto user){
        UserEntity existingUser = userRepository.findById((int) user.getId()).get();
        existingUser.setStatus(user.getStatus());
        UserEntity updatedUser = userRepository.save(existingUser);
        return UserMapper.mapToUserDto(updatedUser);
    }
    //exceptions needed
}
