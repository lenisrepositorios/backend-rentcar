package app.backendrentcar.dtos.user;

public record UserDto(Long id,
                      String nombre,
                      String Apellido,
                      int cedula,
                      String direccion,
                      int telefono) {
}
