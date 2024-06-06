package app.backendrentcar.dtos.car;

import app.backendrentcar.models.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car toDto(Car car);
    Car toEntity(CarDto carDto);
}
