package com.pragma.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDto {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private Long docIdentidad;
    private String celular;
    private String correo;
    private String clave;
    private Long idRole;
    private RoleResponseDto role;
}
