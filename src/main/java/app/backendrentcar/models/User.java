package app.backendrentcar.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String Apellido;

    @Column(unique = true)
    private int cedula;

    private String direccion;
    private int telefono;

    @OneToMany(mappedBy = "user")
    private RentedCar rentas;
}
