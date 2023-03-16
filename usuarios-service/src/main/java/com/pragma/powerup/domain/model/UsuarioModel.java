package com.pragma.powerup.domain.model;

import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;

public class UsuarioModel {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private Long docIdentidad;
    private String celular;
    private String correo;
    private String clave;
    private Long idRole;
    private RoleEntity role;

    public UsuarioModel(Long idUsuario, String nombre, String apellido, Long docIdentidad, String celular, String correo, String clave, Long idRole, RoleEntity role) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.docIdentidad = docIdentidad;
        this.celular = celular;
        this.correo = correo;
        this.clave = clave;
        this.idRole = idRole;
        this.role = role;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(Long docIdentidad) {
        this.docIdentidad = docIdentidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
