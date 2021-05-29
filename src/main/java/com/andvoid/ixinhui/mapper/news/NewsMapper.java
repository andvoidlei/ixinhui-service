package com.andvoid.ixinhui.mapper.news;

import com.andvoid.ixinhui.dto.NewsList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * author: wxl
 * created: 2021/05/29 2:07 下午
 * version 1.0
 */
@Mapper
//@Component(value = "NewsMapper")
public interface NewsMapper {

    /**
     * 聊天室公共接口：分类mapping查询
     */
    List<NewsList> queryNewsList(@Param(value = "categoryId") String categoryId
    );

}
