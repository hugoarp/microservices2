package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.RoleModel;
import com.pragma.powerup.domain.spi.IRolePersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IRoleEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public RoleModel saveRole(RoleModel roleModel) {
        RoleEntity roleEntity = roleRepository.save(roleEntityMapper.toRoleEntity(roleModel));
        return roleEntityMapper.toRoleModel(roleEntity);
    }

    @Override
    public List<RoleModel> getAllRoles() {
        List<RoleEntity> entityList = roleRepository.findAll();
        if (entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return roleEntityMapper.toRoleModelList(entityList);
    }

    @Override
    public RoleModel getRole(Long roleId) {
        return null;
    }

    @Override
    public void updateRole(RoleModel role) {

    }

    @Override
    public void deleteRole(Long roleId) {

    }
}
