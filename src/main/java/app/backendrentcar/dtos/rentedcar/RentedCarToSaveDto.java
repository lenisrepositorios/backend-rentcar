package app.backendrentcar.dtos.rentedcar;

import java.time.LocalDateTime;

public record RentedCarToSaveDto(Long id,
                                 LocalDateTime fechaInicio,
                                 LocalDateTime fechaFinal,
                                 float precio,
                                 String ciudad)
{}