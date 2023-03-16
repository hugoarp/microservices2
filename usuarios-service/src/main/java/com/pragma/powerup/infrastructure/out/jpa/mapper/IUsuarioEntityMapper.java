package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUsuarioEntityMapper {

    UsuarioEntity toUsuarioEntity(UsuarioModel usuarioModel);
    UsuarioModel toUsuarioModel(UsuarioEntity usuarioEntity);
    List<UsuarioModel> toUsuarioModelList(List<UsuarioEntity> usuarioEntityList);
}