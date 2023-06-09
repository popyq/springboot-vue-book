package com.itheima.domain;

import lombok.Data;

/**
 * @Author potato
 * @PackageName:com.itheima.domain
 * @Description: TODO
 * @Date 2023-03-23 21:32
 */
@Data
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;

}
