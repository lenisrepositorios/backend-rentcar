package app.backendrentcar.controllers;

import app.backendrentcar.dtos.car.CarDto;
import app.backendrentcar.dtos.car.CarToSaveDto;
import app.backendrentcar.dtos.user.UserDto;
import app.backendrentcar.dtos.user.UserToSaveDto;
import app.backendrentcar.services.car.CarService;
import app.backendrentcar.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarDto> saveUser(@RequestBody CarToSaveDto carToSaveDto) {
        CarDto savedCar = carService.saveCar(carToSaveDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCar);
    }

    @GetMapping()
    public ResponseEntity<List<CarDto>> getAllCar(){
        List<CarDto> carDtoList = carService.getAllCar();
        return ResponseEntity.ok(carDtoList);
    }
}