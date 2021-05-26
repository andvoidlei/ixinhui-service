package com.andvoid.ixinhui.controller;

import com.andvoid.ixinhui.dto.News;
import com.andvoid.ixinhui.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @wxl
 * @create: 2020-12-26-下午 16:46
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;


    @RequestMapping("/list")
    public News queryNew(@RequestParam(value = "categoryId") String categoryId) {
        News rst = newsService.queryNote(categoryId);
        return rst;
    }
}