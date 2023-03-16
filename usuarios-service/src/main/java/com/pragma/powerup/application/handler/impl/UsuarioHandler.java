package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;
import com.pragma.powerup.application.handler.IUsuarioHandler;
import com.pragma.powerup.application.mapper.IUsuarioRequestMapper;
import com.pragma.powerup.application.mapper.IUsuarioResponseMapper;
import com.pragma.powerup.domain.api.IUsuarioServicePort;
import com.pragma.powerup.domain.model.UsuarioModel;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioHandler implements IUsuarioHandler {
    private final IUsuarioServicePort usuarioServicePort;

    private final IUsuarioRequestMapper usuarioRequestMapper;
    private final IUsuarioResponseMapper usuarioResponseMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UsuarioRequestDto usuarioRequestDto) {
        String claveEncriptada = passwordEncoder.encode(usuarioRequestDto.getClave());
        usuarioRequestDto.setClave(claveEncriptada);

        UsuarioModel usuarioModel = usuarioRequestMapper.toUsuario(usuarioRequestDto);
        usuarioServicePort.saveUsuario(usuarioModel);
    }

    @Override
    public List<UsuarioResponseDto> getAllUsers() {
        return usuarioResponseMapper.toResponseList(usuarioServicePort.getAllUsuarios());
    }
}