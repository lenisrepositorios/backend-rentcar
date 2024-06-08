package app.backendrentcar.services.rentedCar;

import app.backendrentcar.dtos.rentedcar.RentedCarDto;
import app.backendrentcar.dtos.rentedcar.RentedCarMapper;
import app.backendrentcar.dtos.rentedcar.RentedCarToSaveDto;
import app.backendrentcar.models.RentedCar;
import app.backendrentcar.repositories.RentedCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentedCarServiceImpl implements RentedCarService{

    private final RentedCarRepository rentedCarRepository;
    private final RentedCarMapper rentedCarMapper;

    @Autowired
    public RentedCarServiceImpl(RentedCarRepository rentedCarRepository, RentedCarMapper rentedCarMapper){
        this.rentedCarRepository = rentedCarRepository;
        this.rentedCarMapper = rentedCarMapper;
    }

    @Override
    public RentedCarDto saveRentedCar(RentedCarToSaveDto rentedCarToSaveDto){
        RentedCar rentedCar = rentedCarMapper.saveDtoToEntity(rentedCarToSaveDto);
        RentedCar carSaved = rentedCarRepository.save(rentedCar);
        return rentedCarMapper.toDto(carSaved);
    }

    @Override
    public List<RentedCarDto> getAllCar(){
        List<RentedCar> rentedCars = rentedCarRepository.findAll();
        return rentedCars.stream()
                .map(rentedCarMapper::toDto).toList();
    }

    @Override
    public void removeCar(Long id){
        RentedCar rentedCar = rentedCarRepository.findById(id).orElseThrow();
        rentedCarRepository.delete(rentedCar);
    }
}
