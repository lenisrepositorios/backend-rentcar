package app.backendrentcar.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rentedCars")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class RentedCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private Long cedula;

    private String direccion;
    private Long telefono;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;

    @ManyToOne
    @JoinColumn(name = "idCarro")
    private Car carro;
}
