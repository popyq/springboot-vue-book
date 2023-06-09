package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;

import java.util.List;

/**
 * @Author potato
 * @PackageName:com.itheima.service
 * @Description: TODO
 * @Date 2023-03-24 8:44
 */

public interface BookService {

    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();

    IPage<Book> getPage(int currentPage ,int pageSize );

}
