package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.RoleModel;

import java.util.List;

public interface IRolePersistencePort {
    RoleModel saveRole(RoleModel role);

    List<RoleModel> getAllRoles();

    RoleModel getRole(Long roleId);

    void updateRole(RoleModel role);

    void deleteRole(Long roleId);
}
