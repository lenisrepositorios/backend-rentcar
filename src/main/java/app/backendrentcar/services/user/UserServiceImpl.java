package app.backendrentcar.services.user;

import app.backendrentcar.dtos.user.UserDto;
import app.backendrentcar.dtos.user.UserMapper;
import app.backendrentcar.dtos.user.UserToSaveDto;
import app.backendrentcar.models.User;
import app.backendrentcar.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto saveUser(UserToSaveDto userToSaveDto){
        User user = userMapper.saveDtoToEntity(userToSaveDto);
        User userSaved = userRepository.save(user);
        return userMapper.toDto(userSaved);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> userMapper.toDto(user))
                .toList();
    }
}
