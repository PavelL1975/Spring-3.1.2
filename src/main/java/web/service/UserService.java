package web.service;

import web.entities.UserModel;


import java.util.List;

public interface UserService {
    List<UserModel> usersList();
    UserModel showById(long id);
    void save(UserModel userModel);
    void delete(long id);
    void update(UserModel newUser, long id);
    UserModel getUserByLogin(String email);

}
