package com.pragma.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestauranteResponseDto {
    private Long idRestaurante;
    private String nombre;
    private String direccion;
    private Long idPropietario;
    private String telefono;
    private String urlLogo;
    private String nit;
}
