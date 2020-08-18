package com.sunday.dianshang.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Sunday
 * @date 2020/5/22
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDo extends BaseEntity {
    private Long id;

    private String name;

    private Integer age;

    private Short sex;
}
