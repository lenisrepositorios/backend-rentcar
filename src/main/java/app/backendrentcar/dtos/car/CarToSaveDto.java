package app.backendrentcar.dtos.car;

public record CarToSaveDto(Long id,
                           String marca,
                           String modelo,
                           float kilometraje,
                           float velocidadMaxima,
                           String locacion,
                           String imagen,
                           float precio) {
}
