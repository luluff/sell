//package com.imooc.handler;
//
//import com.lulu.config.ProjectUrlConfig;
//import com.lulu.exception.SellerAuthorizeException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.view.RedirectView;
//
///**
// * Created by lulu
// * 2019-07-30 17:44
// */
//@ControllerAdvice
//public class SellExceptionHandler {
//
//    @Autowired
//    private ProjectUrlConfig projectUrlConfig;
//
//    //拦截登录异常
//    //http://sell.natapp4.cc/sell/wechat/qrAuthorize?returnUrl=http://sell.natapp4.cc/sell/seller/login
//    @ExceptionHandler(value = SellerAuthorizeException.class)
//    public  String handlerAuthorizeException() {
////        return new ModelAndView("redirect:"
////        .concat(projectUrlConfig.getWechatOpenAuthorize())
////        .concat("/sell/wechat/qrAuthorize")
////        .concat("?returnUrl=")
////        .concat(projectUrlConfig.getSell())
////        .concat("/sell/seller/login"
//        return "redirect:/hello/login/";
//        }
//
//
//    }
//
