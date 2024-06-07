package app.backendrentcar.services.car;

import app.backendrentcar.dtos.car.CarDto;
import app.backendrentcar.dtos.car.CarMapper;
import app.backendrentcar.dtos.car.CarToSaveDto;
import app.backendrentcar.models.Car;
import app.backendrentcar.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;
    private CarMapper carMapper;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper){
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public CarDto saveCar(CarToSaveDto carToSaveDto){
        Car car = carMapper.saveDtoToEntity(carToSaveDto);
        Car carSaved = carRepository.save(car);
        return carMapper.toDto(carSaved);
    }

    @Override
    public List<CarDto> getAllCar(){
        List<Car> cars = carRepository.findAll();
        return cars.stream()
                .map(car -> carMapper.toDto(car)).toList();
    }
}
