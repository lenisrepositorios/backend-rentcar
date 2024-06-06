package app.backendrentcar.dtos.user;

import app.backendrentcar.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserDto userDto);
    User toDto(User user);
    User saveDtoToEntity(UserToSaveDto userToSaveDto);
}
