package com.pragma.powerup.application.mapper.impl;

import com.pragma.powerup.application.dto.request.RoleRequestDto;
import com.pragma.powerup.application.mapper.IRoleRequestMapper;
import com.pragma.powerup.domain.model.RoleModel;

public class RoleRequestMapperImpl implements IRoleRequestMapper {
    @Override
    public RoleModel toRole(RoleRequestDto roleRequestDto) {
        if (roleRequestDto == null) {
            return null;
        }

        Long idRole = null;
        String nombre = null;
        String descripcion = null;

        nombre = roleRequestDto.getNombre();
        descripcion = roleRequestDto.getDescripcion();

        return new RoleModel(idRole, nombre, descripcion);
    }
}
