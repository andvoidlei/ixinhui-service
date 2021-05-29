package com.andvoid.ixinhui.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.andvoid.ixinhui.dto.News;
import com.andvoid.ixinhui.dto.NewsList;
import com.andvoid.ixinhui.mapper.news.NewsMapper;
import com.andvoid.ixinhui.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created by tony on 2020/12/26.
 */
@Service("NewsService")
public class NewsServiceImpl implements NewsService {

    //@Resource
    //private PartnerMapper partnerMapper;
    Logger logger = LoggerFactory.getLogger(Logger.class);


    @Resource
    private NewsMapper newsMapper;
    //趋势图
    @Override
    public News queryNote(String categoryId){
        List<String> list = new ArrayList<>();
        //list = partnerMapper.queryPartnerCostDay( dateStart, dateEnd);

        String content = "[" +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-03-21/cbf9a441-a6cf-4141-88b6-0d0ea059e4da.jpg\",\n" +
                "\"day_count\": \"5\",\n" +
                "\"photoCount\": \"105\",\n" +
                "\"publish_time\": \"1458397860\",\n" +
                "\"title\": \"驴妈妈海岛季——三亚五日游("+categoryId+")\",\n" +
                "\"trip_id\": \"75788\",\n" +
                "\"uid\": \"4028b2595384617f01538df8c9fc067a\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/pc/place2/2016-03-19//C_786b2a34-ded4-457b-94ed-11417f26f762.jpg\",\n" +
                "\"username\": \"loselv泡泡\"}," +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-09-19/20ef289c-1739-4f26-9b20-1e5c768b2a26.jpg\",\n" +
                "\"day_count\": \"6\",\n" +
                "\"photoCount\": \"179\",\n" +
                "\"publish_time\": \"1471245492\",\n" +
                "\"title\": \"我只愿面朝大海，春暖花开——三亚\",\n" +
                "\"trip_id\": \"93781\",\n" +
                "\"uid\": \"2c9486ee5675402201568c192d572546\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/header/default-photo.gif\",\n" +
                "\"username\": \"lv1577314zk6p\"}" +
                "]";
        System.out.println(content);
        logger.info(content);
        JSONArray jsonArray = JSONArray.parseArray(content);

        String pages = "{\"itemCount\": \"268\",\"page\": \"1\",\"pageCount\": \"27\",\"pageSize\": \"10\"}\n";

        JSONObject jb = JSONObject.parseObject(pages);
        Map<String, Object> map = new HashMap<String,Object>();       //数据采用的哈希表结构
//        new List<NewsList> = newsMapper.queryNewsList("1");
        map.put("list",newsMapper.queryNewsList("1"));
        map.put("pages",jb);

        Map<String, Object> map1 = new HashMap<String,Object>();       //数据采用的哈希表结构
        map1.put("trip",map);
News ns = new News();
ns.setCode("1");
ns.setData(map1);
        return ns;
    }


}