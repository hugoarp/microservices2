package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.RestauranteResponseDto;
import com.pragma.powerup.domain.model.RestauranteModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestauranteResponseMapper {
    RestauranteResponseDto toRestauranteDto(RestauranteModel restauranteModel);

    List<RestauranteResponseDto> toRestauranteDtoList(List<RestauranteModel> restauranteModelList);
}
