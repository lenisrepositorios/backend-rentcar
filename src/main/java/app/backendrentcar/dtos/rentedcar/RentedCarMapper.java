package app.backendrentcar.dtos.rentedcar;

import app.backendrentcar.models.RentedCar;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RentedCarMapper {
    RentedCarMapper INSTANCE = Mappers.getMapper(RentedCarMapper.class);

    RentedCarDto toDto(RentedCar rentedCar);
    RentedCar toEntity(RentedCarDto rentedCarDto);
    RentedCar saveDtoToEntity(RentedCarToSaveDto rentedCarToSaveDto);
}
