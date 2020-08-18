package com.sunday.dianshang.service;

import com.sunday.dianshang.entity.UserDo;

import java.util.List;

/**
 * @author Sunday
 * @date 2020/5/22
 */
public interface UserService {

    List<UserDo> selectUsers();
}
