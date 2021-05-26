package com.andvoid.ixinhui.service;

import com.andvoid.ixinhui.dto.News;

/**
 * Created by tony on 2020/12/26.
 */
public interface NewsService {
    News queryNote(String categoryId);
}
