package com.lulu.controller;

import com.lulu.constant.CookieConstant;
import com.lulu.constant.RedisConstant;
import com.lulu.utils.CookieUtil;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
@Log
@Controller
@RequestMapping("hello")
public class HelloController
{
    @RequestMapping("index")
    public ModelAndView sayHi()
    {
        return new ModelAndView("index");
    }
    @RequestMapping("login")
    public ModelAndView login()
    {
        return new ModelAndView("login");
    }
    @RequestMapping("check")
    public String doLog(String userId,String passWord,HttpServletResponse response)
    {
        Integer expire = RedisConstant.EXPIRE;

        CookieUtil.set(response, CookieConstant.TOKEN, "lll", expire);
        return "redirect:/hello/index/";
    }


}
