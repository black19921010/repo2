package com.sunday.dianshang.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Sunday
 * @date 2020/5/22
 */
@Data
public class BaseEntity {
    private Date createTime;

    private String creator;

    private Short isDelete;
}







