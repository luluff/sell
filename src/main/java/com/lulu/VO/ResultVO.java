package com.lulu.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by lulu
 * 2019-05-12 14:13
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
