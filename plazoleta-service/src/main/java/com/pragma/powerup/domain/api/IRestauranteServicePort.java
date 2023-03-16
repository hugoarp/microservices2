package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteModel;

import java.util.List;

public interface IRestauranteServicePort {

    void saveRestaurante(RestauranteModel restauranteModel);

    List<RestauranteModel> getAllRestaurantes();
}