package com.pragma.powerup.application.mapper.impl;

import com.pragma.powerup.application.dto.request.RoleRequestDto;
import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.mapper.IUsuarioRequestMapper;
import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;

public class UsuarioRequestMapperImpl implements IUsuarioRequestMapper {
    @Override
    public UsuarioModel toUsuario(UsuarioRequestDto usuarioRequestDto) {
        if (usuarioRequestDto == null) {
            return null;
        }

        Long idUsuario = null;
        String nombre = null;
        String apellido = null;
        Long docIdentidad = null;
        String celular = null;
        String correo = null;
        String clave = null;
        Long idRole = null;

        idUsuario = usuarioRequestDto.getIdUsuario();
        nombre = usuarioRequestDto.getNombre();
        apellido = usuarioRequestDto.getApellido();
        docIdentidad = usuarioRequestDto.getDocIdentidad();
        celular = usuarioRequestDto.getCelular();
        correo = usuarioRequestDto.getCorreo();
        clave = usuarioRequestDto.getClave();
        idRole = usuarioRequestDto.getIdRole();

        RoleEntity role = null;

        return new UsuarioModel(idUsuario, nombre, apellido, docIdentidad, celular, correo, clave, idRole, role);
    }
}
