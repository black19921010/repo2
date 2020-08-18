package com.sunday.dianshang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Sunday
 * @date 2020/6/18
 */
@Data
@AllArgsConstructor
public class BaseResponse {

    private int code;

    private String message;

    private Object data;
}
