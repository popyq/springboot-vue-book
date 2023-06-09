package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author potato
 * @PackageName:com.itheima.dao
 * @Description: TODO
 * @Date 2023-03-23 21:45
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

//    mybatis 注解的方法
//    @Select("select * from tbl_book where id =#{id}")
//    Book getById(Integer id);



}
