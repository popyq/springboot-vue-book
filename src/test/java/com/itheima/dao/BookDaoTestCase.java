package com.itheima.dao;

import com.alibaba.druid.filter.AutoLoad;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author potato
 * @PackageName:com.itheima.dao
 * @Description: TODO
 * @Date 2023-03-23 21:48
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void  testGetById(){
//        System.out.println(bookDao.getById(1));
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(4);
        book.setType("测试数据123修改之后");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(4);
    }

    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,2);
        bookDao.selectPage(page,null);
        System.out.println("开始的数据,即第几条数据开始查询"+page.getCurrent());
        System.out.println("每页查询的数量"+page.getSize());
        System.out.println("每页查询的数量:"+page.getPages());
        System.out.println("总数据:"+page.getTotal());
        System.out.println("数据"+page.getRecords());
    }

    @Test
    void testgetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }


    @Test
    void testgetBy2(){
        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
//        lqw.like(Book::getName,"Spring");
//        要注意name 有为空的情况
        if (name != null) lqw.like(Book::getName,name);
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);
    }

}
