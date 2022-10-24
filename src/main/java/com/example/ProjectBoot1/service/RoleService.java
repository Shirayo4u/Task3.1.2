package com.example.ProjectBoot1.service;

import com.example.ProjectBoot1.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    List<Role> getAllRoles();

    Set<Role> findRolesByName(String roleName);
}
