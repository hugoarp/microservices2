package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IUsuarioServicePort;
import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;

import java.util.List;

public class UsuarioUseCase implements IUsuarioServicePort {
    private final IUsuarioPersistencePort usuarioPersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
    }

    @Override
    public void saveUsuario(UsuarioModel usuario) {
        usuarioPersistencePort.saveUsuario(usuario);
    }

    @Override
    public List<UsuarioModel> getAllUsuarios() {
        return usuarioPersistencePort.getAllUsuarios();
    }

    @Override
    public UsuarioModel getUsuario(Long usuarioId) {
        return usuarioPersistencePort.getUsuario(usuarioId);
    }

    @Override
    public void updateUsuario(UsuarioModel usuario) {
        usuarioPersistencePort.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Long usuarioId) {
        usuarioPersistencePort.deleteUsuario(usuarioId);
    }
}
