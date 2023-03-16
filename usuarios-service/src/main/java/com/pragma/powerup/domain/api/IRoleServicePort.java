package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.RoleModel;

import java.util.List;

public interface IRoleServicePort {
    void saveRole(RoleModel role);

    List<RoleModel> getAllRoles();

    RoleModel getRole(Long roleId);

    void updateRole(RoleModel role);

    void deleteRole(Long roleId);
}
