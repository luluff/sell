package com.lulu.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.ref.WeakReference;
import java.util.HashMap;

@RestController
public class TestController
{
    @GetMapping("1")
    public HashMap<String, String> getg(String id,String name)
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        return map;


    }

}
