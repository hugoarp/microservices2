package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.domain.model.UsuarioModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUsuarioRequestMapper {
    UsuarioModel toUsuario(UsuarioRequestDto usuarioRequestDto);
}
