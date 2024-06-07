package app.backendrentcar.services.user;

import app.backendrentcar.dtos.user.UserDto;
import app.backendrentcar.dtos.user.UserToSaveDto;
import app.backendrentcar.models.User;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserToSaveDto userToSaveDto);
    List<UserDto> getAllUser();
}
