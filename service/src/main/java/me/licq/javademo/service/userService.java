package me.licq.javademo.service;

import me.licq.javademo.dao.UserDAO;
import me.licq.javademo.domain.User;
import me.licq.javademo.iservice.IUserService;

/**
 * Created by robertlee on 6/13/16.
 */
public class UserService implements IUserService {

    private UserDAO userDao;

    @Override
    public User getUserByLoginId(String loginId) {
        return null;
    }
}
