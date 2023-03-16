package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class UsuarioRequestDto {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private Long docIdentidad;
    private String celular;
    @Email(message = "Correo no válido")
    private String correo;
    private String clave;
    private Long idRole;
    private RoleRequestDto role;

}
