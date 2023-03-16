package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleRequestDto {
    private int idRole;
    private String nombre;
    private String descripcion;
}
