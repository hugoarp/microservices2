package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.UsuarioModel;

import java.util.List;

public interface IUsuarioPersistencePort {
    UsuarioModel saveUsuario(UsuarioModel usuario);

    List<UsuarioModel> getAllUsuarios();

    UsuarioModel getUsuario(Long usuarioId);

    void updateUsuario(UsuarioModel usuario);

    void deleteUsuario(Long usuarioId);
}
