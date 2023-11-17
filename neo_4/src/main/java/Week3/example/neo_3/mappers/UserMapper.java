package Week3.example.neo_3.mappers;

import Week3.example.neo_3.dto.UserDto;
import Week3.example.neo_3.entities.UserEntity;

public class UserMapper {
    // Convert User JPA Entity into UserDto
    public static UserDto mapToUserDto(UserEntity user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getName(),
                user.getTelephoneNumber(),
                user.getRole(),
                user.getUsername(),
                user.getPassword(),
                user.getStatus()
        );
        return userDto;
    }

    // Convert UserDto into User JPA Entity
    public static UserEntity mapToUser(UserDto userDto){
        UserEntity user = new UserEntity(
                userDto.getId(),
                userDto.getName(),
                userDto.getTelephoneNumber(),
                userDto.getRole(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getStatus()
        );
        return user;
    }
}
