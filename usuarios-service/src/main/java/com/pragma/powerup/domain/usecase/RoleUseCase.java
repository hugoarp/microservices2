package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRoleServicePort;
import com.pragma.powerup.domain.model.RoleModel;
import com.pragma.powerup.domain.spi.IRolePersistencePort;

import java.util.List;

public class RoleUseCase implements IRoleServicePort {
    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }


    @Override
    public void saveRole(RoleModel role) {
        rolePersistencePort.saveRole(role);
    }

    @Override
    public List<RoleModel> getAllRoles() {
        return rolePersistencePort.getAllRoles();
    }

    @Override
    public RoleModel getRole(Long roleId) {
        return rolePersistencePort.getRole(roleId);
    }

    @Override
    public void updateRole(RoleModel role) {
        rolePersistencePort.updateRole(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        rolePersistencePort.deleteRole(roleId);
    }
}
