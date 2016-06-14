package me.licq.javademo.iservice;

import me.licq.javademo.domain.User;

/**
 * Created by robertlee on 6/14/16.
 */
public interface IUserService {
    User getUserByLoginId(String loginId);

}
