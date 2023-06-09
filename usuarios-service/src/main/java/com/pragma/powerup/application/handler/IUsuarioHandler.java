package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;

import java.util.List;

public interface IUsuarioHandler {

    void saveUser(UsuarioRequestDto usuarioRequestDto);

    List<UsuarioResponseDto> getAllUsers();
}