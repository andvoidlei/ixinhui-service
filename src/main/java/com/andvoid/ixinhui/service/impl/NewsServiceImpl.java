package com.andvoid.ixinhui.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.andvoid.ixinhui.dto.News;
import com.andvoid.ixinhui.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by tony on 2020/12/26.
 */
@Service("NewsService")
public class NewsServiceImpl implements NewsService {

    //@Resource
    //private PartnerMapper partnerMapper;
    Logger logger = LoggerFactory.getLogger(Logger.class);


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
                "\"username\": \"lv1577314zk6p\"}," +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-09-19/20ef289c-1739-4f26-9b20-1e5c768b2a26.jpg\",\n" +
                "\"day_count\": \"6\",\n" +
                "\"photoCount\": \"179\",\n" +
                "\"publish_time\": \"1471245492\",\n" +
                "\"title\": \"我只愿面朝大海，春暖花开——三亚\",\n" +
                "\"trip_id\": \"93781\",\n" +
                "\"uid\": \"2c9486ee5675402201568c192d572546\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/header/default-photo.gif\",\n" +
                "\"username\": \"lv1577314zk6p\"}," +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-05-11/49474e09-3e45-4b89-adc5-7369c5d8b1e3.jpg\",\n" +
                "\"day_count\": \"1\",\n" +
                "\"photoCount\": \"34\",\n" +
                "\"publish_time\": \"1462976557\",\n" +
                "\"title\": \"【全民摄影季】三亚千古情魅力游\",\n" +
                "\"trip_id\": \"81572\",\n" +
                "\"uid\": \"3428a92f493cb1e101493f4bc34f00e7\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/header/2c9488775c11dbcd015c2506a0b100c7.png\",\n" +
                "\"username\": \"筇开森\"}," +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-08-29/736e4e26-305f-4c8a-bff0-cc1bb33aa79c.jpg\",\n" +
                "\"day_count\": \"5\",\n" +
                "\"photoCount\": \"18\",\n" +
                "\"publish_time\": \"1472433279\",\n" +
                "\"title\": \"遇上三亚蓝海梦幻游~\",\n" +
                "\"trip_id\": \"95141\",\n" +
                "\"uid\": \"2c9486e45651551701565365154d0632\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/header/default-photo.gif\",\n" +
                "\"username\": \"广东风光国旅\"}," +
                "{\"app_thumb\": \"/uploads/pc/place2/2016-08-25/af687dc1-c399-40f6-9b05-15a7c6ccea37.jpg\",\n" +
                "\"day_count\": \"2\",\n" +
                "\"photoCount\": \"16\",\n" +
                "\"publish_time\": \"1471941725\",\n" +
                "\"title\": \"三亚双湾红树林酒店5天4晚自由行\",\n" +
                "\"trip_id\": \"95286\",\n" +
                "\"uid\": \"40288add3a07cb0c013a313bc4742e4d\",\n" +
                "\"user_img\": \"http://pic.lvmama.com/uploads/header/default-photo.gif\",\n" +
                "\"username\": \"lv15921470808\"}" +
                "]";
        System.out.println(content);
        logger.info(content);
        JSONArray jsonArray = JSONArray.parseArray(content);

        String pages = "{\"itemCount\": \"268\",\"page\": \"1\",\"pageCount\": \"27\",\"pageSize\": \"10\"}\n";

        JSONObject jb = JSONObject.parseObject(pages);
        Map<String, Object> map = new HashMap<String,Object>();       //数据采用的哈希表结构
        map.put("list",jsonArray);
        map.put("pages",jb);

        Map<String, Object> map1 = new HashMap<String,Object>();       //数据采用的哈希表结构
        map1.put("trip",map);
News ns = new News();
ns.setCode("1");
ns.setData(map1);
        return ns;
    }


}