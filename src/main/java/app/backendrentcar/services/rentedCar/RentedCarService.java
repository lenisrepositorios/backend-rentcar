package app.backendrentcar.services.rentedCar;

import app.backendrentcar.dtos.rentedcar.RentedCarDto;
import app.backendrentcar.models.RentedCar;
import app.backendrentcar.repositories.RentedCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RentedCarService {

    List<RentedCarDto> getAllCar();
}
