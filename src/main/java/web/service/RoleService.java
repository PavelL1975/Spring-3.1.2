package web.service;

import web.entities.Roles;

import java.util.List;

public interface RoleService  {
    List<Roles> rolesList();
    Roles findRoleById(long id);
}
