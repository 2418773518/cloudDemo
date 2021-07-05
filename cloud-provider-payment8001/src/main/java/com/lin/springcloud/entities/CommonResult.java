package com.lin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lin lessbug
 * @Time: 2021/6/22  14:29
 * @descrtiption:前端妹子只认这个
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message ) {

        this(code,message,null);
    }
}
