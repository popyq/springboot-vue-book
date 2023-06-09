package com.itheima.controller.utils;

import lombok.Data;

/**
 * @Author potato
 * @PackageName:com.itheima.controller.utils
 * @Description: TODO
 * @Date 2023-03-24 10:05
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){

    }

    public R(Boolean flag){
        this.flag=flag;
    }

    public R(Boolean flag,Object data){
        this.flag=flag;
        this.data = data;
    }

    public R(String msg){
        this.flag=flag;
        this.msg = msg;
    }
}
