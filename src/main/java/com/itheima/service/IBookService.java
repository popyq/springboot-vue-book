package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @Author potato
 * @PackageName:com.itheima.service
 * @Description: TODO
 * @Date 2023-03-24 9:00
 */

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
