package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author potato
 * @PackageName:com.itheima.service
 * @Description: TODO
 * @Date 2023-03-24 9:05
 */
@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void  testGetById(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(4);
        book.setType("测试数据123修改之后");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }

    @Test
    void testDelete(){
        bookService.delete(4);
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(1, 2);
        System.out.println("开始的数据,即第几条数据开始查询"+page.getCurrent());
        System.out.println("每页查询的数量"+page.getSize());
        System.out.println("每页查询的数量:"+page.getPages());
        System.out.println("总数据:"+page.getTotal());
        System.out.println("数据"+page.getRecords());
    }
}
