package com.pragma.powerup.infrastructure.out.jpa.mapper.impl;

import com.pragma.powerup.domain.model.RoleModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IRoleEntityMapper;

import java.util.ArrayList;
import java.util.List;

public class RoleEntityMapperImpl implements IRoleEntityMapper {

    @Override
    public RoleEntity toRoleEntity(RoleModel roleModel) {
        if (roleModel == null) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setIdRole(roleModel.getIdRole());
        roleEntity.setNombre(roleEntity.getNombre());
        roleEntity.setDescripcion(roleEntity.getDescripcion());
        roleEntity.setUsuarios(null);

        return roleEntity;
    }

    @Override
    public RoleModel toRoleModel(RoleEntity roleEntity) {
        if (roleEntity == null) {
            return null;
        }

        Long idRole = null;
        String nombre = null;
        String descripcion = null;

        idRole = roleEntity.getIdRole();
        nombre = roleEntity.getNombre();
        descripcion = roleEntity.getDescripcion();

        return new RoleModel(idRole, nombre, descripcion);
    }

    @Override
    public List<RoleModel> toRoleModelList(List<RoleEntity> roleEntityList) {
        if (roleEntityList == null) {
            return null;
        }

        List<RoleModel> roleModelList = new ArrayList<>(roleEntityList.size());

        for (RoleEntity roleEntity : roleEntityList) {
            roleModelList.add(toRoleModel(roleEntity));
        }

        return roleModelList;
    }
}
