package com.timyidu.controller;

import com.timyidu.entity.User;
import com.timyidu.mapper.data1mapper.User1Mapper;
import com.timyidu.mapper.data2mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author qiuhang
 * @date 14:22 2019/3/13
 * describe:
 */
@Controller
public class IndexController {
    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/freemarkerIndex")
    public String index(Map<String, Object> result) {
        result.put("name", "yushengjun");
        result.put("sex", "0");
        List<String> listResult = new ArrayList<String>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("itmayiedu");
        result.put("listResult", listResult);
        return "index";
    }
    @RequestMapping("/user1")
    @ResponseBody
    public User findUser1(Integer id){
        return user1Mapper.findById(id);
    }

    @RequestMapping("/user2")
    @ResponseBody
    public User findUser2(Integer id){
        return user2Mapper.findById(id);
    }

    public void test(){
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String string:list){
            list.remove("b");
            System.out.println(string);
        }
    }

}
