package com.pragma.powerup.application.mapper.impl;

import com.pragma.powerup.application.dto.response.UsuarioResponseDto;
import com.pragma.powerup.application.mapper.IUsuarioResponseMapper;
import com.pragma.powerup.domain.model.UsuarioModel;

import java.util.ArrayList;
import java.util.List;

public class UsuarioResponseMapperImpl implements IUsuarioResponseMapper {
    @Override
    public UsuarioResponseDto toResponse(UsuarioModel usuarioModel) {
        if (usuarioModel == null) {
            return null;
        }

        UsuarioResponseDto usuarioResponseDto = new UsuarioResponseDto();

        usuarioResponseDto.setNombre(usuarioModel.getNombre());
        usuarioResponseDto.setApellido(usuarioModel.getApellido());
        usuarioResponseDto.setCelular(usuarioModel.getCelular());
        usuarioResponseDto.setCorreo(usuarioModel.getCorreo());
        usuarioResponseDto.setClave(usuarioModel.getClave());
        usuarioResponseDto.setDocIdentidad(usuarioModel.getDocIdentidad());

        return usuarioResponseDto;
    }

    @Override
    public List<UsuarioResponseDto> toResponseList(List<UsuarioModel> usuarioModelList) {
        if (usuarioModelList == null) {
            return null;
        }

        List<UsuarioResponseDto> list = new ArrayList<>(usuarioModelList.size());
        for (UsuarioModel usuarioModel : usuarioModelList) {
            list.add(toResponse(usuarioModel));
        }

        return list;
    }
}
