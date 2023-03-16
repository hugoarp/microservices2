package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "restaurante_empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestauranteEmpleadoEntity {
    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private RestauranteEntity restaurante;
}
