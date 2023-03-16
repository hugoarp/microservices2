package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.RoleRequestDto;
import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.RoleResponseDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;

import java.util.List;

public interface IRoleHandler {
    void saveRole(RoleRequestDto roleRequestDto);

    List<RoleResponseDto> getAllRoles();
}
