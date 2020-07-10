package com.smart.shop.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateCodeUtil {

    /**
     * 生成随机数
     *
     * @param length 1-10之间
     * @return
     */
    public static int createVerifyCode(int length) {
        if (length == 0) {
            return 0;
        }
        int c = (int) Math.pow(10, length - 1);
        int code = (int) ((Math.random() * 9 + 1) * c);
        return code;
    }

    /**
     * 生成订单号
     */
    public static int index = 100;// 用于生成订单标示，自增

    public static synchronized String createCodeNum(String pre) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYMMddHHmmss");
        String orderNum = pre + dateFormat.format(new Date());
        orderNum += index++;
        if (index > 999) {
            index = 100;
        }
        return orderNum;
    }
}
