package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRestauranteServicePort;
import com.pragma.powerup.domain.model.RestauranteModel;
import com.pragma.powerup.domain.spi.IRestaurantePersistencePort;

import java.util.List;

public class RestauranteUseCase implements IRestauranteServicePort {

    private final IRestaurantePersistencePort restaurantePersistencePort;

    public RestauranteUseCase(IRestaurantePersistencePort restaurantePersistencePort) {
        this.restaurantePersistencePort = restaurantePersistencePort;
    }

    @Override
    public void saveRestaurante(RestauranteModel restauranteModel) {
        restaurantePersistencePort.saveRestaurante(restauranteModel);
    }

    @Override
    public List<RestauranteModel> getAllRestaurantes() {
        return restaurantePersistencePort.getAllRestaurantes();
    }
}