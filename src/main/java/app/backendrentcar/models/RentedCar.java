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

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private User usuario;

    @ManyToOne
    @JoinColumn(name = "idCarro")
    private Car carro;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private float precio;
    private String ciudad;
}
