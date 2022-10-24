package com.example.ProjectBoot1.service;

import com.example.ProjectBoot1.dao.RoleDao;
import com.example.ProjectBoot1.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public Set<Role> findRolesByName(String roleName) {
        Set<Role> roles = new HashSet<>();
        for (Role role : getAllRoles()) {
            if (roleName.contains(role.getName())) {
                roles.add(role);
            }
        }
        return roles;
    }
}