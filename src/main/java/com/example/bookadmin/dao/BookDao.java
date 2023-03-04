package com.example.bookadmin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bookadmin.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
