package com.sunday.dianshang.service.impl;

import com.sunday.dianshang.dao.UserMapper;
import com.sunday.dianshang.entity.UserDo;
import com.sunday.dianshang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sunday
 * @date 2020/5/22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public List<UserDo> selectUsers() {
        //redisTemplate.opsForList().s
        return userMapper.selectUsers();
    }


}
