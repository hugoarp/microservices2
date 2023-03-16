package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.UsuarioEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IUsuarioEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UsuarioJpaAdapter implements IUsuarioPersistencePort {

    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;

    @Override
    public UsuarioModel saveUsuario(UsuarioModel usuarioModel) {
        UsuarioEntity usuarioEntity = usuarioRepository.save(usuarioEntityMapper.toUsuarioEntity(usuarioModel));
        return usuarioEntityMapper.toUsuarioModel(usuarioEntity);
    }

    @Override
    public List<UsuarioModel> getAllUsuarios() {
        List<UsuarioEntity> entityList = usuarioRepository.findAll();
        if (entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return usuarioEntityMapper.toUsuarioModelList(entityList);
    }

    @Override
    public UsuarioModel getUsuario(Long usuarioId) {
        return null;
    }

    @Override
    public void updateUsuario(UsuarioModel usuario) {

    }

    @Override
    public void deleteUsuario(Long usuarioId) {

    }
}