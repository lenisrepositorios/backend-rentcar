package app.backendrentcar.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private float kilometraje;
    private float velocidadMaxima;
    private String locacion;
    private String color;
    private float precio;

    @OneToMany(mappedBy = "car")
    private RentedCar rentas;

}
