package app.backendrentcar.controllers;

import app.backendrentcar.dtos.rentedcar.RentedCarDto;
import app.backendrentcar.dtos.rentedcar.RentedCarToSaveDto;
import app.backendrentcar.services.rentedCar.RentedCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rented")
public class RentedCarController {

    private final RentedCarService rentedCarService;

    @Autowired
    public RentedCarController(RentedCarService rentedCarService){
        this.rentedCarService = rentedCarService;
    }

    @PostMapping
    public ResponseEntity<RentedCarDto> saveRentedCar(@RequestBody RentedCarToSaveDto rentedCarToSaveDto){
        RentedCarDto savedCar = rentedCarService.saveRentedCar(rentedCarToSaveDto);
        return ResponseEntity.ok(savedCar);
    }

    @GetMapping
    public ResponseEntity<List<RentedCarDto>> getAllCar(){
        List<RentedCarDto> rentedCarDtoList = rentedCarService.getAllCar();
        return ResponseEntity.ok(rentedCarDtoList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCarById(@PathVariable Long id){
        try{
            rentedCarService.removeCar(id);
            return ResponseEntity.ok().body("eliminado");
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
