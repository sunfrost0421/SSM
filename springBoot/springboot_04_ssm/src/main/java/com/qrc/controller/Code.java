package com.qrc.controller;

public class Code {

    //成功结尾为1，失败结尾为0
    public static final Integer SAVE_OK = 20011;
    public static final Integer UPDATE_OK = 30011;
    public static final Integer GET_OK = 40011;
    public static final Integer DELETE_OK = 50011;

    public static final Integer SAVE_ERR = 20010;
    public static final Integer UPDATE_ERR = 30010;
    public static final Integer GET_ERR = 40010;
    public static final Integer DELETE_ERR = 50010;

    public static final Integer SYSTEM_ERR = 50001;//系统异常
    public static final Integer SYSTEM_TIMEOUT_ERR = 50002;//系统超时异常
    public static final Integer SYSTEM_UNKNOW_ERR = 59999;//系统未知异常
    public static final Integer BUSINESS_ERR = 60001;//业务异常



}
