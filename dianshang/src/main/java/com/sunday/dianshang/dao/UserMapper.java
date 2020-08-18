package com.sunday.dianshang.dao;

import com.sunday.dianshang.entity.UserDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Sunday
 * @date 2020/5/22
 */
@Repository
public interface UserMapper {

    List<UserDo> selectUsers();
}
