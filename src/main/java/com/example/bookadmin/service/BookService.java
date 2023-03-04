package com.example.bookadmin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bookadmin.domain.Book;

public interface BookService extends IService<Book> {
    // 追加的操作与原始操作通过名称区分，功能类似
    boolean saveBook(Book book);
    boolean modify(Book book);
    boolean delete(Integer id);
    IPage<Book> getPage(int currentPage, int pageSize);
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
