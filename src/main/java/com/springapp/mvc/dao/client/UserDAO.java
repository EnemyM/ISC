package com.springapp.mvc.dao.client;

import com.springapp.mvc.model.user.user;

import java.util.List;

/**
 * Created by Anton on 27.01.2016.
 */
public interface UserDAO {
    user findById(int id_user);
    void save(user user);
    void deleteById(int id_user);
    List<user> findAllUsers();
    user findByEmail(String email_user);
}
