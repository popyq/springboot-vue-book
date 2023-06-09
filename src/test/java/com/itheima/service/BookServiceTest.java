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
public class BookServiceTest {

    @Autowired
    private IBookService ibookService;

    @Test
    void  testGetById(){
        System.out.println(ibookService.getById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        ibookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(6);
        book.setType("测试数据123修改之后");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        ibookService.updateById(book);

    }

    @Test
    void testDelete(){
        ibookService.removeById(4);
    }

    @Test
    void testGetAll(){
        System.out.println(ibookService.list());
    }

    @Test
    void testGetPage(){
        IPage<Book> bookPage = new Page<>(1, 2);
        IPage<Book> page = ibookService.page(bookPage);
        System.out.println("开始的数据,即第几条数据开始查询"+page.getCurrent());
        System.out.println("每页查询的数量"+page.getSize());
        System.out.println("每页查询的数量:"+page.getPages());
        System.out.println("总数据:"+page.getTotal());
        System.out.println("数据"+page.getRecords());
    }
}
