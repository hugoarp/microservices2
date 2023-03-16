package com.pragma.powerup.domain.model;

public class RoleModel {
    private Long idRole;
    private String nombre;
    private String descripcion;

    public RoleModel(Long idRole, String nombre, String descripcion) {
        this.idRole = idRole;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
