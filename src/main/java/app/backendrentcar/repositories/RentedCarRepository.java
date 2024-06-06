package app.backendrentcar.repositories;

import app.backendrentcar.models.RentedCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentedCarRepository extends JpaRepository<RentedCar, Long> {
}
