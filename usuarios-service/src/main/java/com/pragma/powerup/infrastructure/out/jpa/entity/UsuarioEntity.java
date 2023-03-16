package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private Long docIdentidad;
    private String celular;
    private String correo;
    private String clave;
    @Column(name = "id_role")
    private Long idRole;

    @ManyToOne
    @JoinColumn(name = "id_role", insertable = false, updatable = false)
    private RoleEntity role;
}
