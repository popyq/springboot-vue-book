package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
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
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService ibookService;

    @GetMapping
    public R getAll(){
        return new R(true,ibookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book){
//        R r = new R();
//        boolean flag = ibookService.save(book);
//        r.setFlag(flag);
        Boolean flag= ibookService.save(book);
        return  new R(flag,flag ? "添加成功^_^ !": "添加失败-_-!");
    }

    @PutMapping
    public R uodate(@RequestBody Book book){
        return new R(ibookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(ibookService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,ibookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){

        IPage<Book> page = ibookService.getPage(currentPage, pageSize,book);
        // 如果当前=页码值大于了总页码值,那么重新执行查询操作,使用最大页码值作为当前页码值
        if (currentPage >page.getPages()){
            page= ibookService.getPage((int)page.getPages(), pageSize,book);
        }
        return new R(true,page);
    }


}
