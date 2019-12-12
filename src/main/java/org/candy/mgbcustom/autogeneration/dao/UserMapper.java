package org.candy.mgbcustom.autogeneration.dao;

import org.candy.mgbcustom.autogeneration.entity.User;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}