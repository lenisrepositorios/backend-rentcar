package app.backendrentcar.services.car;

import app.backendrentcar.dtos.car.CarDto;
import app.backendrentcar.dtos.car.CarToSaveDto;
import app.backendrentcar.models.Car;
import app.backendrentcar.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface CarService {

    CarDto saveCar(CarToSaveDto carToSaveDto);

    List<CarDto> getAllCar();

    List<CarDto> findAvailableCars(String ciudad, LocalDateTime fechaInicio, LocalDateTime fechaFinal);
}
