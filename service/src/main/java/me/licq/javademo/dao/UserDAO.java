package me.licq.javademo.dao;

import me.licq.javademo.domain.User;

/**
 * Created by robertlee on 6/14/16.
 */
public interface UserDAO {

    User getUserByLoginId(String loginId);
}
