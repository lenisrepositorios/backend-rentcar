package app.backendrentcar.dtos.user;

import jakarta.persistence.Column;

public record UserDto(Long id,
                      String nombre,
                      String Apellido,
                      int cedula,
                      String direccion,
                      int telefono) {
}
