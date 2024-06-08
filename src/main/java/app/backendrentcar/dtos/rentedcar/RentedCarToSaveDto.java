package app.backendrentcar.dtos.rentedcar;

import app.backendrentcar.models.Car;

import java.time.LocalDateTime;

public record RentedCarToSaveDto(String nombre,
                                 String apellido,
                                 Long cedula,
                                 String direccion,
                                 Long telefono,
                                 LocalDateTime fechaInicio,
                                 LocalDateTime fechaFinal,
                                 Car carro)
{}