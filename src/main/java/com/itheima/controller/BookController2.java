package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author potato
 * @PackageName:com.itheima.controller
 * @Description: TODO
 * @Date 2023-03-24 9:23
 */
//@RestController
//@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService ibookService;

    @GetMapping
    public List<Book> getAll(){
        return ibookService.list();
    }

    @PostMapping
    public Boolean save(@RequestBody Book book){
        return ibookService.save(book);
    }

    @PutMapping
    public Boolean uodate(@RequestBody Book book){
        return ibookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return ibookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return ibookService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        return ibookService.getPage(currentPage, pageSize, book);
    }


}
