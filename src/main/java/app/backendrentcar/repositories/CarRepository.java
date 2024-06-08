package app.backendrentcar.repositories;

import app.backendrentcar.dtos.car.CarDto;
import app.backendrentcar.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c LEFT JOIN RentedCar r ON c.id = r.carro.id " +
            "WHERE c.locacion = :ciudad AND (" +
            "r.id IS NULL OR " +
            ":fechaInicio NOT BETWEEN r.fechaInicio AND r.fechaFinal AND " +
            ":fechaFinal NOT BETWEEN r.fechaInicio AND r.fechaFinal AND " +
            "r.fechaInicio NOT BETWEEN :fechaInicio AND :fechaFinal AND " +
            "r.fechaFinal NOT BETWEEN :fechaInicio AND :fechaFinal)")
    List<Car> findAvailableCars(
            @Param("ciudad") String ciudad,
            @Param("fechaInicio") LocalDateTime fechaInicio,
            @Param("fechaFinal") LocalDateTime fechaFinal
    );
}
