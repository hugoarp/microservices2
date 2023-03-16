package com.pragma.powerup.infrastructure.out.jpa.mapper.impl;

import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.UsuarioEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IUsuarioEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IRoleRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

public class UsuarioEntityMapperImpl implements IUsuarioEntityMapper {

    @Override
    public UsuarioEntity toUsuarioEntity(UsuarioModel usuarioModel) {
        if (usuarioModel == null) {
            return null;
        }

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setIdUsuario(usuarioModel.getIdUsuario());
        usuarioEntity.setNombre(usuarioModel.getNombre());
        usuarioEntity.setApellido(usuarioModel.getApellido());
        usuarioEntity.setDocIdentidad(usuarioEntity.getDocIdentidad());
        usuarioEntity.setCelular(usuarioModel.getCelular());
        usuarioEntity.setCorreo(usuarioModel.getCorreo());
        usuarioEntity.setIdRole(usuarioEntity.getIdRole());

        String claveEncriptada = bcrypt.encode(usuarioModel.getClave());
        usuarioEntity.setClave(claveEncriptada);

        return usuarioEntity;
    }

    @Override
    public UsuarioModel toUsuarioModel(UsuarioEntity usuarioEntity) {
        if (usuarioEntity == null) {
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
        RoleEntity role = null;

        idUsuario = usuarioEntity.getIdUsuario();
        nombre = usuarioEntity.getNombre();
        apellido = usuarioEntity.getApellido();
        docIdentidad = usuarioEntity.getDocIdentidad();
        celular = usuarioEntity.getCelular();
        correo = usuarioEntity.getCorreo();
        clave = usuarioEntity.getClave();
        idRole = usuarioEntity.getIdRole();
        role = usuarioEntity.getRole();


        return new UsuarioModel(idUsuario, nombre, apellido, docIdentidad, celular, correo, clave, idRole, role);
    }

    @Override
    public List<UsuarioModel> toUsuarioModelList(List<UsuarioEntity> usuarioEntityList) {
        if (usuarioEntityList == null) {
            return null;
        }

        List<UsuarioModel> list = new ArrayList<UsuarioModel>(usuarioEntityList.size());
        for (UsuarioEntity usuarioEntity : usuarioEntityList) {
            list.add(toUsuarioModel(usuarioEntity));
        }

        return list;
    }
}
