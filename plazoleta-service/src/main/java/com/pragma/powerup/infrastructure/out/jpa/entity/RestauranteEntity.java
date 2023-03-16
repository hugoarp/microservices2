package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurantes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestauranteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_restaurante", nullable = false)
    private Long idRestaurante;
    private String nombre;
    private String direccion;
    @Column(name = "id_propietario")
    private Long idPropietario;
    private String telefono;
    @Column(name = "url_logo")
    private String urlLogo;
    private String nit;

    @OneToMany(mappedBy = "restaurante")
    private List<RestauranteEmpleadoEntity> empleados;
}
