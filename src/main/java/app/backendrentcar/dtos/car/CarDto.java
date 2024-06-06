package app.backendrentcar.dtos.car;

public record CarDto(Long id,
                     String marca,
                     String modelo,
                     float kilometraje,
                     float velocidadMaxima,
                     String locacion,
                     String color,
                     float precio) {
}
