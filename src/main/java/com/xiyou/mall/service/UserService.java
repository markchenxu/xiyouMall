package com.xiyou.mall.service;

import com.xiyou.mall.exception.ImoocMallException;
import com.xiyou.mall.model.pojo.User;

/**
 * 描述：     UserService
 */
public interface UserService {

    User getUser();

    void register(String userName, String password) throws ImoocMallException;

    User login(String userName, String password) throws ImoocMallException;

    void updateInformation(User user) throws ImoocMallException;

    boolean checkAdminRole(User user);
}
