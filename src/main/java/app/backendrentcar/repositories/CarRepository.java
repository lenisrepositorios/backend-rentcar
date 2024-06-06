package app.backendrentcar.repositories;

import app.backendrentcar.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
