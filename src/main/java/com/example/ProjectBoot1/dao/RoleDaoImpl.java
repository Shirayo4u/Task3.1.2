package com.example.ProjectBoot1.dao;

import com.example.ProjectBoot1.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("SELECT r FROM Role r", Role.class).getResultList();
    }
}