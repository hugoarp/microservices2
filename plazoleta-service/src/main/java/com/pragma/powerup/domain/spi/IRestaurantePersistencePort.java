package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteModel;

import java.util.List;

public interface IRestaurantePersistencePort {
    RestauranteModel saveRestaurante(RestauranteModel restauranteModel);

    List<RestauranteModel> getAllRestaurantes();
}